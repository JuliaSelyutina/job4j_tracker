package ru.job4j.tracker;

import java.util.ArrayList;

public class Tracker {
    private ArrayList<Item> items = new ArrayList<Item>(100);
    private int ids = 0;

    public Item add(Item item) {
        item.setId(ids);
        items.add(ids, item);
        ids++;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public ArrayList<Item> findAll() {
        items.trimToSize();
        return items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> tmpItems = new ArrayList<Item>();
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index) != null && key.equals(items.get(index).getName())) {
                tmpItems.add(items.get(index));
            }
        }
        return tmpItems;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}
