package hello.world.pack.lesson19;

public class Office {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", Position.DIRECTOR, 58123L);
        Person person2 = new Person("Georgy", Position.DRIVER, 64213L);

        PersonDataBase base = new PersonDataBase();
        base.add(person1);
        base.add(person2);

        System.out.println(base.isManager(person1));
        System.out.println(base.isEmployee(64213L));
    }
}
