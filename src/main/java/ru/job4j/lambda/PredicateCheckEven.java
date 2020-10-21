package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEven {
    public static boolean check(int num) {
        return check(x -> x % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
