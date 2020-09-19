package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int countEquals = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName() != null && item.getName().equals(key)) {
                rsl[countEquals++] = item;
            }
        }
        return Arrays.copyOf(rsl, countEquals);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
}