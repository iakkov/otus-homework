package hello.world.pack.testing;

import org.w3c.dom.ls.LSOutput;

/*
Для чего нужно тестирование?
Чтобы раньше найти ошибку в коде. Для тестирования используется JUnit 5 библиотека. Ручное тестирование и автоматическое тестирование
 */
public class Main {


    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        if (calculator.add(1, 1) == 2) {
            System.out.println("Test add(1, 1) passed.");
        } else {
            System.out.println("Test add (1, 1) failed. ");
        }
        System.out.println("1+1 = " + calculator.add(1, 1));
        System.out.println("3-2 = " + calculator.subtract(3, 2));
        System.out.println("2 * 2 = " + calculator.multiply(2, 2));
    }
}
