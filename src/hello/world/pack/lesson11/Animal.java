package hello.world.pack.lesson11;

public class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int stamina;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }
    public double run(int distance) {
         stamina -= distance;
         System.out.println(name + " пробежал " + distance + " метров. Осталось " + stamina + " единиц выносливости.");
         double time = (distance / runningSpeed) + (distance % runningSpeed);
         return time;
    }
}
