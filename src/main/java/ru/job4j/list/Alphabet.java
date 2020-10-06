package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(list);
        StringBuilder str = new StringBuilder();
        for (String ch : list) {
            str.append(ch);
        }
        return str.toString();
    }
}