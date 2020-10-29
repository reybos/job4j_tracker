package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
    }
}