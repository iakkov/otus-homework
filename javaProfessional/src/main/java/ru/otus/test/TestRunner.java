package ru.otus.test;

import ru.otus.annotations.After;
import ru.otus.annotations.Before;
import ru.otus.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void run(String className) throws Exception {
        Class<?> testClass = Class.forName(className);

        List<Method> beforeMethods = new ArrayList<>();
        List<Method> testMethods   = new ArrayList<>();
        List<Method> afterMethods  = new ArrayList<>();
        splitMethods(testClass, beforeMethods, testMethods, afterMethods);

        int passed = 0, failed = 0;

        for (Method testMethod : testMethods) {
            Object instance = testClass.getDeclaredConstructor().newInstance();
            try {
                invokeMethods(instance, beforeMethods);
                testMethod.invoke(instance);
                passed++;
            } catch (Exception e) {
                failed++;
                System.out.println("Тест " + testMethod.getName() + " не прошел: " + e.getCause());
            } finally {
                invokeMethods(instance, afterMethods);
            }
        }

        printStats(testMethods.size(), passed, failed);
    }

    private static void splitMethods(Class<?> testClass,
                                     List<Method> beforeMethods,
                                     List<Method> testMethods,
                                     List<Method> afterMethods) {
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Before.class)) beforeMethods.add(m);
            if (m.isAnnotationPresent(Test.class)) testMethods.add(m);
            if (m.isAnnotationPresent(After.class)) afterMethods.add(m);
        }
    }

    private static void invokeMethods(Object instance, List<Method> methods) throws Exception {
        for (Method m : methods) {
            m.setAccessible(true);
            m.invoke(instance);
        }
    }

    private static void printStats(int total, int passed, int failed) {
        System.out.println("=== РЕЗУЛЬТАТЫ ТЕСТА ===");
        System.out.println("ВСЕГО: " + total);
        System.out.println("ПРОШЛИ: " + passed);
        System.out.println("НЕ ПРОШЛИ: " + failed);
    }
}