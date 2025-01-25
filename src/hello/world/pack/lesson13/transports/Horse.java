package hello.world.pack.lesson13.transports;

import hello.world.pack.lesson13.terrain.Terrain;

public class Horse implements Transport {
    private final static String NAME = "лошадь";
    private int power;
    public Horse(int power) {
        this.power = power;
    }
    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain.getType().equals("болото")) {
            System.out.println("На лошади тут не проехать");
            return false;
        }
        if (power < distance) {
            System.out.println("Лошадь устала!");
            return false;
        }
        power -= distance;
        System.out.println("Человек проехал на лошади " + distance + " км по " + terrain.getType() + ". У лошади осталось сил: " + power);
        return true;
    }
    @Override
    public String getName() {
        return NAME;
    }
}
