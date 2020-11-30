package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> itNext = it.next();
            while (itNext.hasNext()) {
                rsl.add(itNext.next());
            }
        }
        return rsl;
    }
}