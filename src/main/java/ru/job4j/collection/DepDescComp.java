package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] depart1 = o1.split("/");
        String[] depart2 = o2.split("/");
        int rsl = depart2[0].compareTo(depart1[0]);
        if (rsl != 0) {
            return rsl;
        }
        return o1.compareTo(o2);
    }
}