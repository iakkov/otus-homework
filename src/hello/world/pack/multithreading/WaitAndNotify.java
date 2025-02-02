package hello.world.pack.multithreading;

public class WaitAndNotify {
    private class Counter {
        private int value;
        public void increment() {
            value++;
            System.out.println("Counter value after increment: " + value);
        }
        public void decrement() {
            value--;
            System.out.println("Counter value after decrement: " + value);
        }
    }
    private final Object monitor = new Object(); // Монитор вынесен за рамки counter
    private Counter counter = new Counter();

    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        new Thread(() -> {
            waitAndNotify.toOne();
        }).start();
        new Thread(() -> {
            waitAndNotify.toZero();
        }).start();
    }

    public void toOne() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 0) { // Проверяем, что счетчик не равен нулю
                        monitor.wait(); // Потоку нужно заснуть, пока счетчик не равен нулю
                    }
                    counter.increment(); // Если счетчик равен нулю, тогда нужно повысить счетчик на один
                    monitor.notifyAll(); // Нужно разбудить все потоки, которые сейчас спят
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toZero() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 1) {
                        monitor.wait();
                    }
                    counter.decrement();
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
