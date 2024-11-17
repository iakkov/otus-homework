package hello.world.pack.lesson13;

import hello.world.pack.lesson13.terrain.*;
import hello.world.pack.lesson13.transports.*;

public class Racing {
    public static void main(String[] args) {
        Human human = new Human("Иван");

        Car car = new Car(50);
        Horse horse = new Horse(30);
        Bicycle bicycle = new Bicycle(20);
        Rover rover = new Rover(80);

        Terrain forest = new Forest();
        Terrain meadow = new Meadow();
        Terrain swamp = new Swamp();

        human.getInto(rover);
        human.move(swamp, 15);
        human.getOut();
        human.getInto(horse);
        human.move(meadow, 30);
    }
}
