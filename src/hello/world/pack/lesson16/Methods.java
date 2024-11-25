package hello.world.pack.lesson16;

import java.util.ArrayList;

public class Methods {
    public static ArrayList<Integer> makeSequence(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i < max; i++) {
            list.add(i);
        }
        return list;
    }
    public static int sumOfNumbersHigherThanFive(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer > 5) {
                sum += integer;
            }
        }
        return sum;
    }
    public static void fillList(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }
    public static void increaseEachNumber(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            current += number;
            list.set(i, current);
        }
    }
    public static ArrayList<String> workersNames(ArrayList<Worker> workers) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            names.add(workers.get(i).getName());
        }
        return names;
    }
    public static ArrayList<Worker> minimalAge(ArrayList<Worker> workers, int minAge) {
        ArrayList<Worker> workersWithMinimalAge = new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getAge() >= minAge) {
                workersWithMinimalAge.add(workers.get(i));
            }
        }
        return workersWithMinimalAge;
    }
    public static boolean checkAge(ArrayList<Worker> workers, int minAverageAge) {
        int sumAge = 0;
        for (int i = 0; i < workers.size(); i++) {
            int currentAge = workers.get(i).getAge();
            sumAge += currentAge;
        }
        int averageAge = sumAge / workers.size();
        if (averageAge > minAverageAge) {
            return true;
        }
        else return false;
    }
}
