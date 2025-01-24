package hello.world.pack.lesson12.animals;

public class CatHouse {
    public static void main(String[] args) {
        Plate plate = new Plate(70);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 54);
        cats[1] = new Cat("Мурзик", 14);
        cats[2] = new Cat("Шарик", 20);
        cats[3] = new Cat("Читос", 11);
        cats[4] = new Cat("Суффикс", 35);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println("-----------------");
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
