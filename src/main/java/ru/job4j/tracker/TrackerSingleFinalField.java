package ru.job4j.tracker;

public class TrackerSingleFinalField {
    private static final TrackerSingleFinalField INSTANCE = new TrackerSingleFinalField();
    private Tracker tracker;

    private TrackerSingleFinalField() {
        this.tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static TrackerSingleFinalField getInstance() {
        return INSTANCE;
    }
}
