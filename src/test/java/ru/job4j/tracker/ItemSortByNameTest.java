package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemSortByNameTest {

    @Test
    public void whenItemSortAscByNameSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(6, "test6"),
                new Item(3, "test3"),
                new Item(9, "test9")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(3, "test3"),
                new Item(4, "test4"),
                new Item(5, "test5"),
                new Item(6, "test6"),
                new Item(7, "test7"),
                new Item(8, "test8"),
                new Item(9, "test9")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortAscByNameNotSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(6, "test6"),
                new Item(3, "test3"),
                new Item(9, "test9")
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "test9"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(6, "test6"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(3, "test3"),
                new Item(2, "test2"),
                new Item(1, "test1")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isNotEqualTo(expected);
    }

    @Test
    public void whenItemSortDescByNameSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(6, "test6"),
                new Item(3, "test3"),
                new Item(9, "test9")
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "test9"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(6, "test6"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(3, "test3"),
                new Item(2, "test2"),
                new Item(1, "test1")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortDescByNameNotSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(6, "test6"),
                new Item(3, "test3"),
                new Item(9, "test9")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "test1"),
                new Item(2, "test2"),
                new Item(8, "test8"),
                new Item(7, "test7"),
                new Item(5, "test5"),
                new Item(4, "test4"),
                new Item(6, "test6"),
                new Item(3, "test3"),
                new Item(9, "test9")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isNotEqualTo(expected);
    }
}
