package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        list.add(str);
        return list.size() != check.size();
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("first");
        test.add(0, "second");
        for (String str : test) {
            System.out.println(str);
        }
    }
}
