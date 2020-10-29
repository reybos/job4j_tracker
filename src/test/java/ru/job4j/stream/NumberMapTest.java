package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumberMapTest {
    @Test
    public void test() {
        List<Integer> input = List.of(2, 3, 4);
        List<Integer> expect = List.of(4, 9, 16);
        assertEquals(expect, NumberMap.map(input));
    }
}