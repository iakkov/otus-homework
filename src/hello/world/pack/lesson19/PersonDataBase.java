package hello.world.pack.lesson19;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private Map<Long, Person> persons;

    public PersonDataBase() {
        this.persons = new HashMap<>();
    }
    public Person findByID(Long id) {
        return persons.get(id);
    }
    public void add(Person person) {
        persons.put(person.getId(), person);
    }
    public boolean isManager(Person person) {
        if (person.getPosition() == Position.MANAGER || person.getPosition() == Position.DIRECTOR ||
                person.getPosition() == Position.BRANCH_DIRECTOR || person.getPosition() == Position.SENIOR_MANAGER) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmployee(Long id) {
        if (isManager(findByID(id))) {
            return false;
        }
        else {
            return true;
        }
    }
}
