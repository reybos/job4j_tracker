package ru.job4j.stream;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}