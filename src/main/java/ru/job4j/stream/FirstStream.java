package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {
    public static List<Integer> deleteNegativeNumbers(List<Integer> list) {
        return list.stream().filter(
                num -> num > 0
        ).collect(Collectors.toList());
    }
}
