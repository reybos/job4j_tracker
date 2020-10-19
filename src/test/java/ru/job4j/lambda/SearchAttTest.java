package ru.job4j.lambda;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

public class SearchAttTest {
    @Test
    public void filterSize() {
        List<Attachment> input = Arrays.asList(
                new Attachment("test1", 100),
                new Attachment("test2", 101),
                new Attachment("test3", 102),
                new Attachment("test4", 103)
        );
        List<Attachment> rsl = SearchAtt.filterSize(input);
        List<Attachment> expect = Arrays.asList(
                new Attachment("test2", 101),
                new Attachment("test3", 102),
                new Attachment("test4", 103)
        );
        assertThat(rsl, is(expect));
    }

    @Test
    public void filterName() {
        List<Attachment> input = Arrays.asList(
                new Attachment("bug test1", 100),
                new Attachment("bug", 101),
                new Attachment("test3", 102),
                new Attachment("test4", 103)
        );
        List<Attachment> rsl = SearchAtt.filterName(input);
        List<Attachment> expect = Arrays.asList(
                new Attachment("bug test1", 100),
                new Attachment("bug", 101)
        );
        assertThat(rsl, is(expect));
    }
}