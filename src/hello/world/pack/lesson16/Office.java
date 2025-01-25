package hello.world.pack.lesson16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.WeakHashMap;

import static hello.world.pack.lesson16.Methods.*;

public class Office {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иван", 20);
        Worker worker2 = new Worker("Дмитрий", 33);
        Worker worker3 = new Worker("Геннадий", 54);
        Worker worker4 = new Worker("Петя", 18);
        Worker worker5 = new Worker("Анатолий", 29);
        Worker worker6 = new Worker("Олег", 37);
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
        workers.add(worker6);

        System.out.println(workersNames(workers));
        youngestWorker(workers).info();
    }
}
