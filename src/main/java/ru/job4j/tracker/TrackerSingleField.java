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

    public Tracker getTracker() {
        return tracker;
    }
}
