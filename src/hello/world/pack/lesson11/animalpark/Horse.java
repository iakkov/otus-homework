package hello.world.pack.lesson11.animalpark;

public class Horse extends Animal {
    public Horse(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }
    public double swim(int distance) {
        if (stamina < (distance * 4)) {
            System.out.println(name + " устал.");
            return -1;
        }
        stamina = stamina - (distance * 4);
        System.out.println(name + " проплыл " + distance + " метров. Осталось " + stamina + " единиц выносливости.");
        double time = (distance / runningSpeed) + (distance % runningSpeed);
        return time;
    }
}
