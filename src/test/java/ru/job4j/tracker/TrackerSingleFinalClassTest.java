package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerSingleFinalClassTest {
    @Test
    public void whenManyInstanceOneObject() {
        TrackerSingleFinalClass tracker = TrackerSingleFinalClass.getInstance();
        TrackerSingleFinalClass tracker2 = TrackerSingleFinalClass.getInstance();
        assertThat(tracker, is(tracker2));
    }
}