package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MemTrackerSingleFinalFieldTest {
    @Test
    public void whenManyInstanceOneObject() {
        TrackerSingleFinalField tracker = TrackerSingleFinalField.getInstance();
        TrackerSingleFinalField tracker2 = TrackerSingleFinalField.getInstance();
        assertThat(tracker, is(tracker2));
    }
}