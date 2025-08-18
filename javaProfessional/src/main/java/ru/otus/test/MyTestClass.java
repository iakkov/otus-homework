package ru.otus.test;

import ru.otus.annotations.After;
import ru.otus.annotations.Before;
import ru.otus.annotations.Test;

public class MyTestClass {

    @Before
    public void before1() {
        System.out.println("Тест before1 запустился и отработал!");
    }

    @Before
    public void before2() {
        System.out.println("Тест before2 запустился и отработал!");
    }

    @Test
    public void test1() {
        System.out.println("Тест test1 запустился и отработал!");
    }

    @Test
    public void test2() {
        System.out.println("Тест test2 запустился!");
        throw new RuntimeException("Ошибка в тесте 2");
    }

    @Test
    public void test3() {
        System.out.println("Тест test3 запустился и отработал!");
    }

    @After
    public void after1() {
        System.out.println("Тест after1 запустился и отработал!");
    }

    @After
    public void after2() {
        System.out.println("Тест after2 запустился и отработал!");
    }
}