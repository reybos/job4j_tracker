package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

public class ArraysSortTest {
    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        Assert.assertArrayEquals(expect, result);
    }
}