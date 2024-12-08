package hello.world.pack.lesson19.sort;

import java.util.Arrays;

import static hello.world.pack.lesson19.sort.Sort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {22, 58, 12, 45, 94, 9, 3, 24, 35};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
