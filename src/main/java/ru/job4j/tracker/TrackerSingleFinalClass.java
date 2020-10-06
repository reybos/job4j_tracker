package ru.job4j.tracker;

import java.util.List;

public class TrackerSingleFinalClass {
    private Tracker tracker;

    private TrackerSingleFinalClass() {
        this.tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static TrackerSingleFinalClass getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleFinalClass INSTANCE = new TrackerSingleFinalClass();
    }

    public static void main(String[] args) {
        TrackerSingleFinalClass tracker = TrackerSingleFinalClass.getInstance();
        tracker.getTracker().add(new Item("test"));
        List<Item> items = tracker.getTracker().findByName("test");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
