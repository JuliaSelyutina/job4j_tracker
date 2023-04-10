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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int counter = 0;
        Item[] tmpItems = new Item[size];
        for (int index = 0; index < size; index++) {
            if (items[index] != null && key.equals(items[index].getName())) {
                tmpItems[counter] = items[index];
                counter++;
            }
        }
        return Arrays.copyOf(tmpItems, counter);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            rsl = true;
        }
        return rsl;
    }
}
