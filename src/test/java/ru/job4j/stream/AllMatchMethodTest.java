package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllMatchMethodTest {
    @Test
    public void test() {
        assertTrue(AllMatchMethod.check(List.of("1234", "abcd")));
        assertFalse(AllMatchMethod.check(List.of("1234", "ab")));
    }
}