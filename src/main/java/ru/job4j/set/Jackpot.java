package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> rsl = new HashSet<>();
        rsl.addAll(Arrays.asList(combination));
        return rsl.size() == 1;
    }
}