package hello.world.pack.lesson11.animalpark;

public abstract class Animal {
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
         if (stamina < distance) {
             System.out.println(name + " устало!");
             return -1;
         }
         stamina -= distance;
         System.out.println(name + " пробежал " + distance + " метров. Осталось " + stamina + " единиц выносливости.");
         double time = (distance / runningSpeed) + (distance % runningSpeed);
         return time;
    }
}
