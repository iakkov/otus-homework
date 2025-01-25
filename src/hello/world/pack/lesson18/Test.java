package hello.world.pack.lesson18;

public class Test {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", "88005553535");
        phoneBook.add("Сидоров Сидор Сидорович", "88005556536");
        phoneBook.add("Петров Петр Петрович", "88005557846");
        phoneBook.add("Максимов Максим Максимович", "88005554837");

        System.out.println(phoneBook.find("Петров Петр Петрович"));
        System.out.println(phoneBook.containsPhoneNumber("88005556536"));
    }
}
