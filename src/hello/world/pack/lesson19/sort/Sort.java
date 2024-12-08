package hello.world.pack.lesson19.sort;

public class Sort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }
    }
}
