package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {
    @Test
    public void convert() {
        List<Student> input = List.of(
                new Student(70, "Иванов"),
                new Student(70, "Иванов"),
                new Student(10, "Петров"),
                new Student(20, "Сидоров")
        );
        ListToMap func = new ListToMap();
        Map<String, Student> rsl = func.convert(input);
        Map expect = Map.of(
                "Иванов", new Student(70, "Иванов"),
                "Петров", new Student(10, "Петров"),
                "Сидоров", new Student(20, "Сидоров")
        );
        assertThat(rsl, is(expect));
    }
}