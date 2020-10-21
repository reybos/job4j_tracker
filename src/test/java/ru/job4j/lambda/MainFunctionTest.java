package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = MainFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = MainFunction.diapason(2, 5, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(8D, 18D, 32D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = MainFunction.diapason(2, 5, x -> 4 * x);
        List<Double> expected = Arrays.asList(8D, 12D, 16D);
        assertThat(result, is(expected));
    }
}