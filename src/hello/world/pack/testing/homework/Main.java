package hello.world.pack.testing.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayFromTheLastOne(new int[]{2,1,2,2,2})));
        System.out.println(isCorrectArray(new int[] {2,2,2,2,2,2}));
    }

    public static int[] arrayFromTheLastOne(int[] array) {
        int index = 0;
        boolean isOneExisting = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                index = i;
                isOneExisting = true;
            }
        }
        if (isOneExisting == false) {
            throw new RuntimeException();
        }
        int[] newArray = Arrays.copyOfRange(array, index + 1, array.length);
        return newArray;
    }
    public static boolean isCorrectArray(int[] array) {
        boolean isOneExisting = false;
        boolean isTwoExisting = false;
        for (Integer i : array) {
            if (i == 1) {
                isOneExisting = true;
                continue;
            }
            if (i == 2) {
                isTwoExisting = true;
                continue;
            }
            if (i != 1 || i != 2) {
                return false;
            }
        }
        if (isOneExisting && isTwoExisting) {
            return true;
        } else return false;
    }
}