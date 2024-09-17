package org.example;

import java.time.LocalDate;

public class Animal {
    String name;
    LocalDate birthday;

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
