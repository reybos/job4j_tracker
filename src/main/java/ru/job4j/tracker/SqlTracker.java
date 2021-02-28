package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {
    private Connection cn;

    public SqlTracker() {
        try (InputStream in = SqlTracker.class
                .getClassLoader()
                .getResourceAsStream("app.properties")
        ) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public SqlTracker(Connection cn) {
        this.cn = cn;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) throws SQLException {
        try (PreparedStatement statement =
                cn.prepareStatement("insert into items(name) values (?)",
                        Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            statement.execute();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getInt(1));
                }
            }
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) throws SQLException {
        boolean result;
        try (PreparedStatement statement =
                     cn.prepareStatement("update items set name = ? where id = ?")) {
            statement.setString(1, item.getName());
            statement.setInt(2, id);
            result = statement.executeUpdate() > 0;
        }
        return result;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean result;
        try (PreparedStatement statement =
                     cn.prepareStatement("delete from items where id = ?")) {
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        }
        return result;
    }

    @Override
    public List<Item> findAll() throws SQLException {
        Item searchedItem = new Item();
        String sql = "select * from items";
        BiConsumerException<PreparedStatement, Item> func = (statement, item) -> { };
        return select(searchedItem, sql, func);
    }

    @Override
    public List<Item> findByName(String key) throws SQLException {
        Item searchedItem = new Item(key);
        String sql = "select * from items where name = ?";
        BiConsumerException<PreparedStatement, Item> func = (statement, item) -> {
            statement.setString(1, item.getName());
        };
        return select(searchedItem, sql, func);
    }

    @Override
    public Item findById(int id) throws SQLException {
        Item searchedItem = new Item(id);
        String sql = "select * from items where id = ?";
        BiConsumerException<PreparedStatement, Item> func = (statement, item) -> {
            statement.setInt(1, item.getId());
        };
        List<Item> rsl = select(searchedItem, sql, func);
        return rsl.size() == 1 ? rsl.get(0) : null;
    }

    private List<Item> select(
            Item item, String sql, BiConsumerException<PreparedStatement, Item> func
    ) throws SQLException {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement statement =
                     cn.prepareStatement(sql)) {
            func.accept(statement, item);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    items.add(new Item(
                            resultSet.getInt("id"),
                            resultSet.getString("name")
                    ));
                }
            }
        }
        return items;
    }
}