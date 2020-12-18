package ru.job4j.tracker;

import java.sql.SQLException;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store tracker) throws SQLException {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item with ID " + id + " removed");
        } else {
            out.println("Item with ID " + id + " is not removed");
        }
        return true;
    }
}
