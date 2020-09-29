package ru.job4j.tracker;

public enum TrackerSingleEnum {
    INSTANCE;
    private Tracker tracker;

    TrackerSingleEnum() {
        this.tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }
}
