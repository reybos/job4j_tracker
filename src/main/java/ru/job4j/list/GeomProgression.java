package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> progression = new ArrayList<>(count);
        int elem, sum = 0;
        for (int i = 0; i < count; i++) {
            elem = (int)(first * Math.pow(denominator, i));
            progression.add(elem);
            sum += elem;
        }
        return sum;
    }
}
