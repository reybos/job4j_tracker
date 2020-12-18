package ru.job4j.tracker;

public class TrackerSingleFinalField {
    private static final TrackerSingleFinalField INSTANCE = new TrackerSingleFinalField();
    private MemTracker tracker;

    private TrackerSingleFinalField() {
        this.tracker = new MemTracker();
    }

    public MemTracker getTracker() {
        return tracker;
    }

    public static TrackerSingleFinalField getInstance() {
        return INSTANCE;
    }
}
