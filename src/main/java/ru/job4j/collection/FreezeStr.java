package ru.job4j.collection;

import java.util.List;
import java.util.stream.Collectors;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        List<Character> leftList = getCharsList(left);
        List<Character> rightList = getCharsList(right);
        return leftList.equals(rightList);
    }

    private static List<Character> getCharsList(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .sorted()
                .collect(Collectors.toList());
    }
}
