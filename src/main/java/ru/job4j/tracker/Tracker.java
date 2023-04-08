package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int sizeOfNotEmptyItems = 0;
        Item[] tmpItems = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                tmpItems[sizeOfNotEmptyItems] = items[index];
                sizeOfNotEmptyItems++;
            }
        }
        return Arrays.copyOf(tmpItems, sizeOfNotEmptyItems);
    }

    @SuppressWarnings("checkstyle:EmptyBlock")
    public Item[] findByName(String key) {
        int sizeOfEqualItems = 0;
        Item[] tmpItems = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null && key.equals(items[index].getName())) {
                tmpItems[sizeOfEqualItems] = items[index];
                sizeOfEqualItems++;
            }
        }
        return Arrays.copyOf(tmpItems, sizeOfEqualItems);
    }
}
