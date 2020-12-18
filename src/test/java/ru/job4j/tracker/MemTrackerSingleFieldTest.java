package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MemTrackerSingleFieldTest {
    @Test
    public void whenManyInstanceOneObject() {
        TrackerSingleField tracker = TrackerSingleField.getInstance();
        TrackerSingleField tracker2 = TrackerSingleField.getInstance();
        assertThat(tracker, is(tracker2));
    }
}