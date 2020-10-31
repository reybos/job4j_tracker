package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 4 != 0)
                .collect(Collectors.toList());
    }
}