package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionFormulaTest {
    @Test
    public void test() {
        assertEquals(1, FunctionFormula.calculate(0), 0.01);
        assertEquals(4, FunctionFormula.calculate(1), 0.01);
        assertEquals(9, FunctionFormula.calculate(2), 0.01);
    }
}