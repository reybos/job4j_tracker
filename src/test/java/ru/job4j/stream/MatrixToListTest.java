package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListTest {
    @Test
    public void convert() {
        Integer[][] input = {{1, 2}, {3, 4}};
        List<Integer> expect = List.of(1, 2, 3, 4);
        MatrixToList func = new MatrixToList();
        List<Integer> rsl = func.convert(input);
        assertThat(rsl, is(expect));
    }
}