package ru.job4j.tracker;

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
        Item[] items = tracker.getTracker().findByName("test");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
