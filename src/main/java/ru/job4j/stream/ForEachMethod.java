package ru.job4j.stream;

import java.util.stream.Stream;

public class ForEachMethod {
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}