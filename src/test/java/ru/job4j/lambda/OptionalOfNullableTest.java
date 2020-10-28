package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalOfNullableTest {
    @Test
    public void whenNotNull() {
        assertEquals(
                Optional.of("c"),
                OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNull() {
        assertEquals(
                Optional.empty(),
                OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c", null),
                        null
                )
        );
    }
}