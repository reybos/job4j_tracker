package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}