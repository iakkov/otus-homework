package hello.world.pack.multithreading;
/*
Пулы потоков.

Порядок работы:
1) Создаем пул потоков через статический метод класса Executors;
2) С помощью метода execute() ставим задачу, которая будет выполнена в параллельном потоке;
3) В конце работы завершаем работу пула потоков методом shutdown().
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterDemo {
    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 8; i++) {
            final int index = i;
            serv.execute(() -> {
                System.out.println("START^ " + index);
                try {
                    Thread.sleep(1000 + (int)(1000 * Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("END: " + index);
            });
        }
        serv.shutdown(); // Завершаем работу пула
    }
}
