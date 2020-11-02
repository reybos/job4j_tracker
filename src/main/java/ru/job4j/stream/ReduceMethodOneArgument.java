package ru.job4j.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((n1, n2) -> n1 * n2)
                .get();
    }
}
