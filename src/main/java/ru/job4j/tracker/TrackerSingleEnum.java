package ru.job4j.tracker;

public enum TrackerSingleEnum {
    INSTANCE;
    private MemTracker tracker;

    TrackerSingleEnum() {
        this.tracker = new MemTracker();
    }

    public MemTracker getTracker() {
        return tracker;
    }
}
