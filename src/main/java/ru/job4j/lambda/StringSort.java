package ru.job4j.lambda;

import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return Integer.compare(right.length(), left.length());
        };
    }
}
