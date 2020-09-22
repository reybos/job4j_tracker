package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item with ID " + id + " removed");
        } else {
            System.out.println("Item with ID " + id + " is not removed");
        }
        return true;
    }
}
