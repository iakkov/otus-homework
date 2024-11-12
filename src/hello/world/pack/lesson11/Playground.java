package hello.world.pack.lesson11;

import hello.world.pack.lesson11.animalpark.*;

public class Playground {
    public static void main(String[] args) {
        Horse petty = new Horse("Petty", 5, 3, 100);
        petty.swim(3);
        Cat barsik = new Cat("Барсик", 3, 0, 100);
        barsik.run(80);
        barsik.run(30);
        petty.swim(10);
    }

}
