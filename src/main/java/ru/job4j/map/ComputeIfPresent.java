package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int index: name.keySet()) {
            name.computeIfPresent(index, (key, value) -> value + " " + surname.get(index));
        }
        return name;
    }
}