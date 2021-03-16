package ru.job4j.tracker;

import org.junit.Test;

import java.sql.Timestamp;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HbmTrackerTest {
    @Test
    public void whenAddAndFindById() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name", "desc", new Timestamp(System.currentTimeMillis()));
        tracker.add(item);
        Item itemBd = tracker.findById(item.getId());
        assertThat(itemBd, is(item));
    }

    @Test
    public void whenUpdateAndFindByName() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name", "desc", new Timestamp(System.currentTimeMillis()));
        tracker.add(item);
        item.setName("test");
        tracker.replace(item.getId(), item);
        Item itemBd = tracker.findByName(item.getName()).get(0);
        assertThat(itemBd, is(item));
    }

    @Test
    public void whenDeleteAndFindAll() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name", "desc", new Timestamp(System.currentTimeMillis()));
        Item item2 = new Item("name", "desc", new Timestamp(System.currentTimeMillis()));
        Item item3 = new Item("name", "desc", new Timestamp(System.currentTimeMillis()));
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item.getId());
        assertEquals(tracker.findAll(), List.of(item2, item3));
    }
}