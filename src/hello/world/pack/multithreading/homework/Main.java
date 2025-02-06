package hello.world.pack.multithreading.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static  final Object monitor = new Object();
    private static char currentChar = 'A';
    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(Main::printA);
        serv.execute(Main::printB);
        serv.execute(Main::printC);
        serv.shutdown();

    }
    public static void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'A') {
                        monitor.wait();
                    }
                    System.out.print('A');
                    currentChar = 'B';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'B') {
                        monitor.wait();
                    }
                    System.out.print('B');
                    currentChar = 'C';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'C') {
                        monitor.wait();
                    }
                    System.out.print('C');
                    currentChar = 'A';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
