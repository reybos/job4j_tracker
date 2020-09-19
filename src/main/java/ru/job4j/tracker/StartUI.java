package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        System.out.println(tracker.findById(1));
        for (int i = 0; i < 5; i++) {
            item = new Item();
            item.setName("name" + i);
            tracker.add(item);
        }
        Item repeatItem = new Item();
        repeatItem.setName("name1");
        tracker.add(repeatItem);
        Item[] repeatList = tracker.findByName("name1");
        for (int i = 0; i < repeatList.length; i++) {
            System.out.println(repeatList[i]);
        }
        System.out.println();
        Item[] allList = tracker.findAll();
        for (int i = 0; i < allList.length; i++) {
            System.out.println(allList[i]);
        }
    }
}
