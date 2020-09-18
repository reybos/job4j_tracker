package ru.job4j.tracker;

public class Builder extends Engineer {
    private int salary;
    private String specialization;

    public int getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Building build(Drawing drawing, Materials materials) {
        return new Building();
    }
}
