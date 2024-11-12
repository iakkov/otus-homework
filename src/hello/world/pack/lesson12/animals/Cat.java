package hello.world.pack.lesson12.animals;

public class Cat {
    private String name;
    private int appetite;
    boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }
    public void eat(Plate plate) {
        if (!plate.minusFood(appetite)) {
            System.out.println("Еды недостаточно. " + name + " не поел.");
            return;
        }
        appetite = 0;
        fullness = true;
        System.out.println(name + " покушал, теперь он сыт.");
    }
    public void info() {
        System.out.println("Меня зовут " + name + ". Мой аппетит равен " + appetite + " единицам.");
        if (!fullness) {
            System.out.println("Я голоден!");
            return;
        }
        System.out.println("Я сыт!");
    }

}
