package hello.world.pack.lesson13.transports;

import hello.world.pack.lesson13.terrain.Terrain;

public class Bicycle implements Transport {
    private int stamina;
    public Bicycle (int stamina) {
        this.stamina = stamina;
    }
    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain.getType().equals("болото")) {
            System.out.println("Велосипед тут не проедет");
            return false;
        }
        if (stamina < distance) {
            System.out.println("Водитель велосипеда устал!");
            return false;
        }
        stamina -= distance;
        System.out.println("Человек проехал на велосипеде " + distance + " км по " + terrain.getType() + ". Осталось сил: " + stamina);
        return true;
    }
}
