package hello.world.pack.lesson10;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        User[] users = new User[10];
        users[0] = new User("Ivanov", "Ivan", "Ivanovich", 1998, "ivanovi@mail.ru");
        users[1] = new User("Petrov", "Petr", "Petrovich", 1976, "petrov_p@gmail.com");
        users[2] = new User("Sidorov", "Sidr", "Sidorovich", 1966, "sidor12@bk.ru");
        users[3] = new User("Romanov", "Roman", "Romanovich", 2001, "romanov22@list.ru");
        users[4] = new User("Alexandrov", "Alexandr", "Alexandrovich", 1980, "alexalex44@gmail.com");
        users[5] = new User("Vladov", "Vlad", "Vladovich", 1991, "vladov_v@mail.com");
        users[6] = new User("Denisov", "Denis", "Denisovich", 1982, "denisokay1@yahoo.com");
        users[7] = new User("Pavlov", "Pavel", "Pavlovich", 2005, "superpavel05@yandex.ru");
        users[8] = new User("Maximov", "Maxim", "Maximovich", 1977, "max_77@live.ru");
        users[9] = new User("Kotlov", "Yuri", "Vadimovich", 1994, "kotlov_y@rambler.ru");

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBirthYear() < (currentYear - 40) ) {
                users[i].printInfo();
            }
        }
        Box box1 = new Box(120, 80, 80, "Красная");
        box1.getInfo();
    }
}