package ru.job4j.stream;

import java.util.stream.Stream;

public class StreamBuilder {
    public static Stream<Object> createStream(Integer[] data) {
         return Stream.builder().add(data[0]).add(data[data.length - 1]).build();
    }
}