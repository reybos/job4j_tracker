package ru.job4j.stream;

import java.util.Arrays;

public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).max().getAsInt();
    }

    public long min() {
        return Arrays.stream(data).min().getAsInt();
    }

    public double avg() {
        return Arrays.stream(data).average().getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }
}