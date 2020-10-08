package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("andrey@yandex.ru", "Andrey Bosy");
        for (String key : map.keySet()) {
            System.out.println(key + map.get(key));
        }
    }
}
