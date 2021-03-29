package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(Store.class);
//        context.register(ConsoleInput.class);
//        context.register(StartUI.class);
        context.scan("ru.job4j.di");
        context.scan("ru.job4j.tracker");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        System.out.println("-----");
        StartUI ui2 = context.getBean(StartUI.class);
        ui2.add("test");
        ui2.print();
    }
}
