package ru.job4j.tracker;

public class TrackerSingleField {
    private static TrackerSingleField instance;
    private MemTracker tracker;

    private TrackerSingleField() {
        this.tracker = new MemTracker();
    }

    public static TrackerSingleField getInstance() {
        if (instance == null) {
            instance = new TrackerSingleField();
        }
        return instance;
    }

    public MemTracker getTracker() {
        return tracker;
    }
}
