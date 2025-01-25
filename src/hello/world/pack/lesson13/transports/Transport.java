package hello.world.pack.lesson13.transports;

import hello.world.pack.lesson13.terrain.Terrain;

public interface Transport {
    boolean move(int distance, Terrain terrain);
    String getName();
}
