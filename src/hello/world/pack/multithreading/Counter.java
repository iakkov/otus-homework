package hello.world.pack.multithreading;
/*
Ключевое слово synchronized в сигнатуре метода означает, что в единицу времени только один поток,
у одного объекта, может выполнять синхронизированный метод.
В роли монитора выступает объект, у которого вызвали синхронизированный метод.
 */
public class Counter {
    int value;
    public synchronized void increment() {
        value++;
    }
    public synchronized void decrement() {
        value--;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                counter.decrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.value);
    }
}
