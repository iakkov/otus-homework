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
    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        /**
         * Если часть массива содержит 0 или 1 элемент, то больше сортировка не нужна и мы уходим из метода.
         */
        if (lowIndex >= highIndex) {
            return;
        }
        /**
         * Опорный элемент, от которого делается деление. Почему-то принято выбирать последний элемент массива. Тут вопрос.
         */
        int pivot = array[highIndex];
        /**
         * Установка указателей, левого и правого. Они показывают на конкретный индекс массива в моменте.
         * Левый указатель показывает на начало массива, а правый - на конец массива.
         * Указатели будут двингаться навстречу друг другу.
         */
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        /**
         * Пока указатели не пересеклись (leftPointer < rightPointer),
         * левый указатель двигается вправо пока не найдет элемент больше pivot (array[leftPointer] <= pivot)
         * правый указатель двигается влево пока не найдет элемент меньше pivot (array[rightPointer] >= pivot)
         */
        while(leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        /**
         * Тут меняем местами pivot с тем элементом, на который показывает левый палец
         */
        swap(array, leftPointer, highIndex);
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
