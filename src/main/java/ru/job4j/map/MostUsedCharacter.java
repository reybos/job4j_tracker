package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> abc = new TreeMap<>();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (char elem : chars) {
            abc.computeIfPresent(elem, (key, value) -> value + 1);
            abc.putIfAbsent(elem, 1);
        }
        char rsl = ' ';
        int maxCount = 0;
        for (char key : abc.keySet()) {
            if (abc.get(key) > maxCount) {
                rsl = key;
                maxCount = abc.get(key);
            }
        }
        return rsl;
    }
}