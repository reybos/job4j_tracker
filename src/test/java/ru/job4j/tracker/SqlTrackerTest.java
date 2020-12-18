package ru.job4j.tracker;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SqlTrackerTest {
    private Store tracker;

    @Before
    public void init() {
        tracker = new SqlTracker();
        tracker.init();
    }

    @Test
    public void whenAdd() throws SQLException {
        Item item = new Item(0);
        tracker.add(item);
        assertTrue(item.getId() > 0);
        tracker.delete(item.getId());
    }

    @Test
    public void whenDelete() throws SQLException {
        Item item = new Item(0);
        tracker.add(item);
        assertTrue(tracker.delete(item.getId()));
    }

    @Test
    public void whenFindAll() throws SQLException {
        tracker.add(new Item(0, "item1"));
        tracker.add(new Item(0, "item2"));
        List<Item> rsl = tracker.findAll();
        for (int i = 0; i < rsl.size(); i++) {
            assertEquals(String.format("item%d", (i + 1)), rsl.get(i).getName());
            tracker.delete(rsl.get(i).getId());
        }
    }

    @Test
    public void whenFindById() throws SQLException {
        Item item = new Item(0, "test");
        tracker.add(item);
        Item rsl = tracker.findById(item.getId());
        assertEquals(rsl.getName(), item.getName());
        tracker.delete(item.getId());
    }

    @Test
    public void whenReplace() throws SQLException {
        Item item = new Item(0, "test");
        tracker.add(item);
        item.setName("item");
        tracker.replace(item.getId(), item);
        assertEquals("item", tracker.findById(item.getId()).getName());
        tracker.delete(item.getId());
    }

    @Test
    public void whenFindByName() throws SQLException {
        tracker.add(new Item(0, "item"));
        tracker.add(new Item(0, "item"));
        List<Item> rsl = tracker.findByName("item");
        assertEquals(2, rsl.size());
        for (int i = 0; i < rsl.size(); i++) {
            assertEquals("item", rsl.get(i).getName());
            tracker.delete(rsl.get(i).getId());
        }
    }
}