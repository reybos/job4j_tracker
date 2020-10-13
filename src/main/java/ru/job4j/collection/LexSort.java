package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftNum = extractNumber(left);
        int rightNum = extractNumber(right);
        return Integer.compare(leftNum, rightNum);
    }

    private int extractNumber(String str) {
        String[] array = (str.replaceAll("\\D+", " ").trim()).split(" ");
        return Integer.parseInt(array[0]);
    }
}