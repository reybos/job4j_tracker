package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LimitMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("A", "B", "C"),
                LimitMethod.firstThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}