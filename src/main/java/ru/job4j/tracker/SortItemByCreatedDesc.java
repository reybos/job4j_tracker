package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemByCreatedDesc implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o2.getCreated().compareTo(o1.getCreated());
    }
}
