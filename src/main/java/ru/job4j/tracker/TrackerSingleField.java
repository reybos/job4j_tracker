package ru.job4j.tracker;

public class TrackerSingleField {
    private static TrackerSingleField instance;
    private Tracker tracker;

    private TrackerSingleField() {
        this.tracker = new Tracker();
    }

    public static TrackerSingleField getInstance() {
        if (instance == null) {
            instance = new TrackerSingleField();
        }
        return instance;
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
