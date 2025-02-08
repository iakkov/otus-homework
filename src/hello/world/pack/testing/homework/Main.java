package hello.world.pack.testing.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayFromTheLastOne(new int[]{2,2,2,2,2})));
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
}