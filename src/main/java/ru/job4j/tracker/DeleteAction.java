package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete itemDelete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item with ID " + id + " removed");
        } else {
            System.out.println("Item with ID " + id + " is not removed");
        }
        return true;
    }
}
