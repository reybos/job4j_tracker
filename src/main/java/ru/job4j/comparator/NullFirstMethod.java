package ru.job4j.comparator;

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}