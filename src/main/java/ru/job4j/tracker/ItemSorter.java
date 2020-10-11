package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "Item 1"),
                new Item(2, "Item 2"),
                new Item(4, "Item 4"),
                new Item(3, "Item 3")
        );
        System.out.println("Исходный список");
        System.out.println(items);
        System.out.println("Отсортирован по возрастанию по дате создания");
        Collections.sort(items, new SortItemByCreatedAsc());
        System.out.println(items);
        System.out.println("Отсортирован по убыванию по дате создания");
        Collections.sort(items, new SortItemByCreatedDesc());
        System.out.println(items);
        System.out.println("Отсортирован по возрастанию по имени");
        Collections.sort(items, new SortItemByNameAsc());
        System.out.println(items);
        System.out.println("Отсортирован по убыванию по имени");
        Collections.sort(items, new SortItemByNameDesc());
        System.out.println(items);
        System.out.println("Отсортирован по возрастанию по id");
        Collections.sort(items, new SortItemByIdAsc());
        System.out.println(items);
        System.out.println("Отсортирован по убыванию по id");
        Collections.sort(items, new SortItemByIdDesc());
        System.out.println(items);
    }
}
