package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Test item"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item out = tracker.findAll()[0];
        Item expected = new Item("Test item");
        assertThat(expected.getName(), is(out.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                Integer.toString(item.getId()),
                "replaced item"
        };
        Input input = new StubInput(answers);
        StartUI.editItem(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("deleted item");
        tracker.add(item);
        String[] answers = {
                Integer.toString(item.getId())
        };
        Input input = new StubInput(answers);
        StartUI.deleteItem(input, tracker);
        Item deleted = tracker.findById(item.getId());
        Assert.assertNull(deleted);
    }
}