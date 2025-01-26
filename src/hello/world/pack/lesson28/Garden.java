package hello.world.pack.lesson28;

import hello.world.pack.lesson28.boxes.Box;

public class Garden {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> mixedBox = new Box<>();

        appleBox.addFruit(new Apple(1.8));
        appleBox.addFruit(new Apple(2.9));
        appleBox.addFruit(new Apple(1.8));

        orangeBox.addFruit(new Orange(1.0));
        orangeBox.addFruit(new Orange(2.0));
        orangeBox.addFruit(new Orange(2.2));

        System.out.println("Вес коробки с яблоками: " + appleBox.weightOfBox());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weightOfBox());

        System.out.println("Коробки равны по весу: " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruits(anotherAppleBox);
    }
}
