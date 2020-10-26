package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> convert(List<Student> students) {
        return students.stream()
                .sorted((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()))
                .distinct()
                .collect(
                        Collectors.toMap(
                                Student::getSurname,
                                student -> student
                        )
                );
    }
}
