package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl;
        if (strings.contains(value)) {
            rsl = Optional.of(value);
        } else {
            rsl = Optional.empty();
        }
        return rsl;
    }
}
