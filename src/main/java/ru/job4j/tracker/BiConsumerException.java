package ru.job4j.tracker;

import java.sql.SQLException;

@FunctionalInterface
public interface BiConsumerException<T, U> {
    void accept(T t, U u) throws SQLException;
}
