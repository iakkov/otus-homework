package hello.world.pack.lesson19.sort;

import java.util.Arrays;

import static hello.world.pack.lesson19.sort.Sort.bubbleSort;
import static hello.world.pack.lesson19.sort.Sort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {22, 58, 12, 45, 94, 9, 3, 24, 35, 71, 923, 783, 19, 123, 98};
        //bubbleSort(array);
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
