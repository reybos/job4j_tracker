package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> depart1 = Departments.fillGaps(Arrays.asList(o1));
        List<String> depart2 = Departments.fillGaps(Arrays.asList(o2));
        return depart1.get(0).equals(depart2.get(0)) ? o1.compareTo(o2) : o2.compareTo(o1);
    }
}