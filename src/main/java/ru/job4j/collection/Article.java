package ru.job4j.collection;

import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> originList = List.of(origin.split("\\s*(\\s|,|!|\\.)\\s*"));
        List<String> lineList = List.of(line.split("\\s*(\\s|,|!|\\.)\\s*"));
        boolean rsl = true;
        for (String word : lineList) {
            if (!originList.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
