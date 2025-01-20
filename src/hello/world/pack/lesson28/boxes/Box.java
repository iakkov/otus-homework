package hello.world.pack.lesson28.boxes;

import hello.world.pack.lesson28.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();
}
