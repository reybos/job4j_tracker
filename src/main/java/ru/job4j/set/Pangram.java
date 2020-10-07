package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        s = s.replaceAll("\\s+","");
        s = s.toLowerCase();
        Set<String> chars = new HashSet<>();
        chars.addAll(Arrays.asList(s.split("")));
        return chars.size() == 26;
    }
}