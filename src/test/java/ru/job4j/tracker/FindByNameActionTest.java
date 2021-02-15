package ru.job4j.tracker;

import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByNameActionTest {
    @Test
    public void whenExecuteThenSuccess() throws SQLException {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item"));
        FindByNameAction action = new FindByNameAction(out);

        Input input = mock(Input.class);
        when(input.askStr(any(String.class))).thenReturn("Item");
        action.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(
                out.toString(),
                is("=== Find item by name ===" + ln + "Item{id=1, name='Item'}" + ln)
        );
    }

    @Test
    public void whenExecuteThenError() throws SQLException {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item"));
        FindByNameAction action = new FindByNameAction(out);

        Input input = mock(Input.class);
        action.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(
                out.toString(),
                is("=== Find item by name ===" + ln + "No items with this name were found" + ln)
        );
    }
}