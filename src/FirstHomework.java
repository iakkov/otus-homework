public class FirstHomework {
    public static void main(String[] args) {
        greetings();
    }

    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }
    public static void checkSign(int a, int b, int c) {
        if ((a + b + c) >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    public static void selectColor(int data) {
        if (data <= 10) System.out.println("Красный");
        else if (data > 10 && data <= 20) System.out.println("Жёлтный");
        else System.out.println("Зелёный");
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
