package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== All items ====");
        List<Item> allItems = tracker.findAll();
        for (Item item : allItems) {
            out.println(item);
        }
        return true;
    }
}
