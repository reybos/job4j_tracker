package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(str -> str.startsWith("A"))
                .filter(str -> str.endsWith(".java"))
                .collect(Collectors.toList());
    }
}