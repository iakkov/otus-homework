package hello.world.pack;

public class Lesson5 {
    public static void main(String[] args) {
        countString(5, "Кошка");
        int[] a = {10, 20, 4, 5, 15, 3};
        sumElements(a);
        //increaseElements(5, a);
        sumHalfIsBigger(a);
    }
    public static void countString(int a, String string) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }
    public static void sumElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов больше 5: " + sum);
    }
    public static void fillArray(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
    }
    public static void increaseElements(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
        }
    }
    public static void sumHalfIsBigger(int[] array) {
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < (array.length / 2); i++) {
            firstHalfSum += array[i];
        }
        for (int j = array.length - 1; j >= (array.length / 2); j--) {
            secondHalfSum += array[j];
        }
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма элементов первой половины массива больше. Она равна " + firstHalfSum);
        }
        if (secondHalfSum > firstHalfSum) {
            System.out.println("Сумма элементов второй половины массива больше. Она равна " + secondHalfSum);
        }
        if (secondHalfSum == firstHalfSum) {
            System.out.println("Суммы элементов обеих половин равны");
        }
    }

}
