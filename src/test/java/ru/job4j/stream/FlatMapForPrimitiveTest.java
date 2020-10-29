package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                15,
                FlatMapForPrimitive.sum(new int[][] {
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
}