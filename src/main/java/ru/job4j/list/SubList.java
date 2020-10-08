package ru.job4j.list;

import java.util.List;

public class SubList {
    /*
    * метод принимает два параметра - список и элемент, который предполагается, что содержится в
    * том списке. Необходимо реализовать метод, чтобы он возвращал результаты следующим образом:
    1. Элемента нет в списке - возвращает пустой список.
    2. Элемент в списке встречается 1 раз - возвращает пустой список.
    3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента
    *  и заканчивая предшествующим последнему вхождению элемента в исходной коллекции.
    * */
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int firstIndex = list.indexOf(el);
        int lastIndex = list.lastIndexOf(el);
        if (firstIndex == lastIndex) {
            return list.subList(0, 0);
        }
        return list.subList(firstIndex, lastIndex);
    }
}
