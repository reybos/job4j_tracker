package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] == '(' ? 1 : -1;
            if (sum < 0) {
                break;
            }
        }
        return sum == 0;
    }
}