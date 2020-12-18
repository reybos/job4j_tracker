package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqlTrackerTest {
    public Connection init() {
        try (InputStream in = SqlTracker.class
                .getClassLoader()
                .getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name"));
            assertThat(tracker.findByName("name").size(), is(1));
        }
    }

    @Test
    public void whenAdd() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item(0);
            tracker.add(item);
            assertTrue(item.getId() > 0);
        }
    }

    @Test
    public void whenDelete() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item(0);
            tracker.add(item);
            assertTrue(tracker.delete(item.getId()));
        }
    }

    @Test
    public void whenFindAll() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item(0, "item1"));
            tracker.add(new Item(0, "item2"));
            List<Item> rsl = tracker.findAll();
            for (int i = 0; i < rsl.size(); i++) {
                assertEquals(String.format("item%d", (i + 1)), rsl.get(i).getName());
            }
        }
    }

    @Test
    public void whenFindById() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item(0, "test");
            tracker.add(item);
            Item rsl = tracker.findById(item.getId());
            assertEquals(rsl.getName(), item.getName());
        }
    }

    @Test
    public void whenReplace() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item(0, "test");
            tracker.add(item);
            item.setName("item");
            tracker.replace(item.getId(), item);
            assertEquals("item", tracker.findById(item.getId()).getName());
        }
    }

    @Test
    public void whenFindByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item(0, "item"));
            tracker.add(new Item(0, "item"));
            List<Item> rsl = tracker.findByName("item");
            assertEquals(2, rsl.size());
            for (int i = 0; i < rsl.size(); i++) {
                assertEquals("item", rsl.get(i).getName());
            }
        }
    }
}