package hello.world.pack.lesson13;

import hello.world.pack.lesson13.Human;
import hello.world.pack.lesson13.terrain.Forest;
import hello.world.pack.lesson13.terrain.Meadow;
import hello.world.pack.lesson13.terrain.Swamp;
import hello.world.pack.lesson13.terrain.Terrain;
import hello.world.pack.lesson13.transports.Bicycle;
import hello.world.pack.lesson13.transports.Car;
import hello.world.pack.lesson13.transports.Horse;
import hello.world.pack.lesson13.transports.Rover;

public class Racing {
    public static void main(String[] args) {
        Human human = new Human("Иван");

        Car car = new Car(50);
        Horse horse = new Horse(30);
        Bicycle bicycle = new Bicycle(20);
        Rover rover = new Rover(40);

        Terrain forest = new Forest();
        Terrain meadow = new Meadow();
        Terrain swamp = new Swamp();

    }
}
