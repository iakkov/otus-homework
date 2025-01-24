package hello.world.pack;

import java.util.Random;
import java.util.Scanner;
public class FirstHomework {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, напишите число от 1 до 5");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number < 1 || number > 5) {
            System.out.println("Вы ввели неверное число, повторите попытку!");
        }
        else if (number == 1) greetings();
        else if (number == 2) checkSign((int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
        else if (number == 3) selectColor((int)(Math.random()*100));
        else if (number == 4) compareNumbers((int)(Math.random()*100), (int)(Math.random()*100));
        else if (number == 5) addOrSubtractAndPrint((int)(Math.random()*100), (int)(Math.random()*100), getRandomBoolean());
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
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int newInitValue = initValue + delta;
            System.out.println(newInitValue);
        }
        else {
            int newInitValue = initValue - delta;
            System.out.println(newInitValue);
        }
    }
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
