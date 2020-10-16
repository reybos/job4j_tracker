package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] depart1 = o1.split("/");
        String[] depart2 = o2.split("/");
        int rsl = depart2[0].compareTo(depart1[0]);
        if (rsl != 0) {
            return rsl;
        }
        int length = Math.min(depart1.length, depart2.length);
        for (int i = 1; i < length; i++) {
            rsl = depart1[i].compareTo(depart2[i]);
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0 && depart1.length != depart2.length) {
            rsl = Integer.compare(depart1.length, depart2.length);
        }
        return rsl;
    }
}