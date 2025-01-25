package hello.world.pack.lesson19;

public class Person {
    String name;
    Position position;
    Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }
    public Long getId() {
        return id;
    }
}
