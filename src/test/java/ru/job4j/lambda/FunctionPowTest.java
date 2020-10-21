package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionPowTest {
    @Test
    public void test() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }
}