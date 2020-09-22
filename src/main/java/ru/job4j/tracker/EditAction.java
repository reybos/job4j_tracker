package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter a new name for the item: ");
        Item editedItem = new Item();
        editedItem.setName(name);
        if (tracker.replace(id, editedItem)) {
            System.out.println("Item with ID " + id + " edited");
        } else {
            System.out.println("Item with ID " + id + " is not edited");
        }
        return true;
    }
}
