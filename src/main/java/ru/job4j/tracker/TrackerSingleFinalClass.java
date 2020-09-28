package ru.job4j.tracker;

public class TrackerSingleFinalClass {
    private Tracker tracker;

    private TrackerSingleFinalClass() {
        this.tracker = new Tracker();
    }

    public static TrackerSingleFinalClass getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleFinalClass INSTANCE = new TrackerSingleFinalClass();
    }

    public static void main(String[] args) {
        TrackerSingleFinalClass tracker = TrackerSingleFinalClass.getInstance();
        tracker.add(new Item("test"));
        Item[] items = tracker.findByName("test");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }
}
