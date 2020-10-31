package ru.job4j.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFilter {
    public static class Worker {
        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {
        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        Optional<Worker> worker = OptionalFilter.findByPassport(workers, passport);
        return worker
                .stream()
                .flatMap(worker1 -> worker1.getChildren().stream())
                .filter(child -> child.getAge() < 15)
                .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }
}
