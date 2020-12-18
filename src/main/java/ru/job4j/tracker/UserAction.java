package ru.job4j.tracker;

import java.sql.SQLException;

public interface UserAction {
    String name();

    boolean execute(Input input, Store tracker) throws SQLException;
}