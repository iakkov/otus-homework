package hello.world.pack.lesson13.transports;

import hello.world.pack.lesson13.terrain.Terrain;

public class Rover implements Transport {
    int fuel;
    @Override
    public boolean move(int distance, Terrain terrain) {
        if (fuel < distance) {
            System.out.println("У вездехода закончился бензин");
            return false;
        }
        fuel -= distance;
        System.out.println("Человек проехал на вездеходе " + distance + " км по " + terrain.getType() + ". Осталось горючего: " + fuel);
        return true;
    }
}
