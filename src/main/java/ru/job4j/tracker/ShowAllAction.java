package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All items ====");
        Item[] allItems = tracker.findAll();
        for (Item item : allItems) {
            System.out.println(item);
        }
        return true;
    }
}
