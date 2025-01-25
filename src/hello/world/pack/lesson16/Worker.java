package hello.world.pack.lesson16;

public class Worker {
    String name;
    int age;
    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void info() {
        System.out.println("Меня зовут " + name + " и мой возраст: " + age);
    }
}
