package hello.world.pack.lesson22.withthread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int size = 100_000_000;
        double[] array = new double[size];
        long startTime = System.currentTimeMillis();
        Thread[] threadArray = new Thread[4];
        for (int t = 0; t < 4; t++) {
            int start = t * (size / 4);
            int end = (t + 1) * (size / 4);
            threadArray[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threadArray[t].start();
        }
        for (Thread t : threadArray) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Многопоточная реализация завершена " + (endTime - startTime) + " мс");
    }
}
