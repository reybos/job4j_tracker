package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void collect() {
        Profiles func = new Profiles();
        List<Address> expect = List.of(
                new Address("London", "Red Square", 2, 2),
                new Address("Moscow", "Red Square", 1, 1),
                new Address("Paris", "Red Square", 3, 3)
        );
        List<Profile> input = expect.stream()
                .map(Profile::new)
                .collect(Collectors.toList());
        List<Address> rsl = func.collect(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenIdenticalAddresses() {
        Profiles func = new Profiles();
        List<Address> expect = new ArrayList<>();
        expect.add(new Address("London", "Red Square", 2, 2));
        expect.add(new Address("Moscow", "Red Square", 1, 1));
        expect.add(new Address("Moscow", "Red Square", 1, 1));
        expect.add(new Address("Paris", "Red Square", 3, 3));
        List<Profile> input = expect.stream()
                .map(Profile::new)
                .collect(Collectors.toList());
        expect.remove(1);
        List<Address> rsl = func.collect(input);
        assertThat(rsl, is(expect));
    }
}