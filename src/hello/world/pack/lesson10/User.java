package hello.world.pack.lesson10;

public class User {
    private String lastname;
    private String firstname;
    private String patronymic;
    private int birthYear;
    private String email;

    public User(String lastname, String firstname, String patronymic, int birthYear, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }
    public void printInfo() {
        System.out.println("Ф.И.О.: " + lastname + " " + firstname + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
