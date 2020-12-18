package ru.job4j.tracker;

import java.sql.SQLException;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Store tracker) throws SQLException {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter a new name for the item: ");
        Item editedItem = new Item();
        editedItem.setName(name);
        if (tracker.replace(id, editedItem)) {
            out.println("Item with ID " + id + " edited");
        } else {
            out.println("Item with ID " + id + " is not edited");
        }
        return true;
    }
}
