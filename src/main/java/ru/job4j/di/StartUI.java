package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.job4j.tracker.ConsoleInput;

@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    private ConsoleInput in;

    @Autowired
    public void setIn(ConsoleInput in) {
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