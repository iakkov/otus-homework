package hello.world.pack.lesson29.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите имя файла: ");
            String fileName = console.nextLine();
            System.out.println("Введите искомую последовательность символов: ");
            String searchKey = console.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
