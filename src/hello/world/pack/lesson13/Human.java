package hello.world.pack.lesson13;

import hello.world.pack.lesson13.terrain.Terrain;
import hello.world.pack.lesson13.transports.Transport;

public class Human {
    private String name;
    private Transport transport;
    public Human (String name) {
        this.name = name;
    }
    public void getInto(Transport transport) {
        this.transport = transport;
        System.out.println(name + " теперь передвигается на " + transport);
    }
    public void getOut() {
        System.out.println(name + " вышел из " + this.transport);
        this.transport = null;
    }
    public boolean move(Terrain terrain, int distance) {
        if (transport == null) {
            System.out.println(name + " идет пешком " + distance + " км по " + terrain.getType());
            return true;
        }
        return transport.move(distance, terrain);
    }
}
