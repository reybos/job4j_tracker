package ru.job4j.stream;

import java.util.List;

public class StreamUsageStyle {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .map(task -> task.name)
                .forEach(System.out::println);
    }
}