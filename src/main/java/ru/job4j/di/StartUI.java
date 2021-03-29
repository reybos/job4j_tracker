package ru.job4j.di;

import ru.job4j.tracker.ConsoleInput;

public class StartUI {
    private Store store;
    private ConsoleInput in;

    public StartUI(Store store, ConsoleInput in) {
        this.store = store;
        this.in = in;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void askAndPrintStr() {
        String str = in.askStr("Введите строку");
        add(str);
        print();
    }
}