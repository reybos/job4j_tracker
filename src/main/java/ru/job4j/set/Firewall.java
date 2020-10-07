package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String rsl = "Вы сделали правильный выбор!";
        String[] check = s.split(" ");
        for (int i = 0; i < check.length; i++) {
            if (words.contains(check[i])) {
                rsl = "Выберите другую статью...";
                break;
            }
        }
        return rsl;
    }
}