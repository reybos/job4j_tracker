package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FirstStreamTest {
    @Test
    public void deleteNegativeNumbers() {
        List<Integer> input = List.of(1, -1, 0, 123, 12);
        List<Integer> expect = List.of(1, 123, 12);
        List<Integer> rsl = FirstStream.deleteNegativeNumbers(input);
        assertThat(rsl, is(expect));
    }
}