package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.job4j.config.Car;

import java.sql.Timestamp;

public class HibernateAlter {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try {
            SessionFactory sf = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();
            Session session = sf.openSession();
            session.beginTransaction();

            Item item1 = new Item("Item1", "description1", new Timestamp(1459510232000L));
            Item item2 = new Item("Item2", "description2", new Timestamp(1459510332000L));
            Item item3 = new Item("Item3", "description3", new Timestamp(1459511232000L));
            session.save(item1);
            session.save(item2);
            session.save(item3);

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}