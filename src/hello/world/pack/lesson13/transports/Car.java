package hello.world.pack.lesson13.transports;

import hello.world.pack.lesson13.terrain.Terrain;

public class Car implements Transport {
    private int fuel;
    public Car(int fuel) {
        this.fuel = fuel;
    }
    @Override
    public boolean move(int distance, Terrain terrain) {
        String terrainType = terrain.getType();
        if (terrainType.equals("густой лес") || terrainType.equals("болото")) {
            System.out.println("Машина не может двигаться по " + terrainType);
            return false;
        }
        if (fuel < distance) {
            System.out.println("Машине не хватает бензина!");
            return false;
        }
        fuel -= distance;
        System.out.println("Машина проехала " + distance + " км по " + terrainType + ". Осталось бензина: " + fuel);
        return true;
    }
}
