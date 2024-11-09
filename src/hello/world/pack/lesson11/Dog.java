package hello.world.pack.lesson11;

public class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }
    public int swim(int distance) {
        if (stamina < (distance * 2)) {
            System.out.println(name + " устал.");
            return -1;
        }
        stamina = stamina - (distance * 2);
        System.out.println(name + " проплыл " + distance + " метров. Осталось " + stamina + " выносливости.");
        return distance / swimmingSpeed;
    }
}
