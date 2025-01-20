package hello.world.pack.lesson28.boxes;

import hello.world.pack.lesson28.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public double weightOfBox() {
        double result = 0.0;
        for (int i = 0; i < fruits.size(); i++) {
            result += fruits.get(i).getWeight();
        }
        return result;
    }
    public boolean compare(Box<T> otherBox) {
        return Math.abs(this.weightOfBox() - otherBox.weightOfBox()) < 0.001;
    }
    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            System.out.println("Нельзя пересыпать фрукты в ту же самую коробку");
        } else {
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}
