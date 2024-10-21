public class Lesson5 {
    public static void main(String[] args) {
        countString(5, "Кошка");
        int[] a = {10, 20, 4, 5, 15, 3};
        sumElements(a);

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
}
