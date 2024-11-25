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
}
