package hello.world.pack.lesson10;

public class Box {
    private double length;
    private double width;
    private double heigth;
    private String color;
    private boolean isOpen = false;
    private String object;
    public Box(double length, double width, double heigth, String color) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }
    public void open() {
        isOpen = true;
        System.out.println("Вы открыли коробку");
    }
    public void close() {
        isOpen = false;
        System.out.println("Вы закрыли коробку");
    }
    public void reColor(String newColor) {
        color = newColor;
    }
    public void getInfo() {
        System.out.println("Коробка имеет следующие размеры: ширина - " + width + ", длина - " + length + ", высота - " + heigth + "\nЦвет коробки: " + color);
        if (isOpen) System.out.println("Коробка открыта!");
        else System.out.println("Коробка закрыта!");
    }
    public void putSomething(String object) {
        this.object = object;
        System.out.println("Вы положили в коробку " + object + ". Теперь коробка заполнена!");
    }
    public void getSomething() {
        if (isOpen) {
            this.object = null;
            System.out.println("Коробка теперь пустая.");
        }
        else {
            System.out.println("Сначала откройте коробку!");
        }
    }
}
