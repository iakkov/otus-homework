package hello.world.pack.lesson18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }
    public void add(String name, String phoneNumber) {
        phoneBook.put(name, new HashSet<>());
        phoneBook.get(name).add(phoneNumber);
    }
    public Set<String> find(String name) {
        return phoneBook.getOrDefault(name, new HashSet<>());
    }
    public boolean containsPhoneNumber(String phoneNumber) {
        for(Set<String> phones : phoneBook.values()) {
            if (phones.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
