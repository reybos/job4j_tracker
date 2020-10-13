package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NullFirstMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullFirstMethod.nullFirst());
        assertEquals(Arrays.asList(null, "1", "2", "3"), list);
    }
}