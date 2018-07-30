package com.example.administrator.recyclerviewsimpe;

import java.util.ArrayList;
import java.util.List;

// Класс используемый вместо БД
public class User {

    public static List<User> users = new ArrayList<>();

    public static String[] usersName = {"John", "Michale", "Ann", "Jack", "Job", "Jason",
            "Bill", "Steve", "Alice"};
    public static String[] usersEmail = {"john@user.com", "michale@user.com", "ann@user.com",
            "jack@user.com", "job@user.com", "jason@user.com", "bill@user.com",
            "steve@user.com", "alice@user.com"};

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}