package ru.job4j.tracker;

import java.time.LocalDate;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
