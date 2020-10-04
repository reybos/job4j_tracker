package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int firstIndex = list.indexOf(str);
        int lastIndex = list.lastIndexOf(str);
        return firstIndex == lastIndex && firstIndex != -1;
    }
}
