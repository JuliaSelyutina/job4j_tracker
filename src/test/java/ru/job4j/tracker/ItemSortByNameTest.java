package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemSortByNameTest {
    public static final LocalDateTime CREATED = LocalDateTime.now();

    @Test
    public void whenItemSortAscByNameSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(6, "test6", CREATED),
                new Item(3, "test3", CREATED),
                new Item(9, "test9", CREATED)
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(3, "test3", CREATED),
                new Item(4, "test4", CREATED),
                new Item(5, "test5", CREATED),
                new Item(6, "test6", CREATED),
                new Item(7, "test7", CREATED),
                new Item(8, "test8", CREATED),
                new Item(9, "test9", CREATED)
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortAscByNameNotSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(6, "test6", CREATED),
                new Item(3, "test3", CREATED),
                new Item(9, "test9", CREATED)
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "test9", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(6, "test6", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(3, "test3", CREATED),
                new Item(2, "test2", CREATED),
                new Item(1, "test1", CREATED)
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isNotEqualTo(expected);
    }

    @Test
    public void whenItemSortDescByNameSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(6, "test6", CREATED),
                new Item(3, "test3", CREATED),
                new Item(9, "test9", CREATED)
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "test9", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(6, "test6", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(3, "test3", CREATED),
                new Item(2, "test2", CREATED),
                new Item(1, "test1", CREATED)
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortDescByNameNotSuccessfully() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(6, "test6", CREATED),
                new Item(3, "test3", CREATED),
                new Item(9, "test9", CREATED)
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "test1", CREATED),
                new Item(2, "test2", CREATED),
                new Item(8, "test8", CREATED),
                new Item(7, "test7", CREATED),
                new Item(5, "test5", CREATED),
                new Item(4, "test4", CREATED),
                new Item(6, "test6", CREATED),
                new Item(3, "test3", CREATED),
                new Item(9, "test9", CREATED)
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isNotEqualTo(expected);
    }
}
