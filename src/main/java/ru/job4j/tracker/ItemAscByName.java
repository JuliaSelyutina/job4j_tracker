package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item fistItem, Item secondItem) {
        return fistItem.getName().compareTo(secondItem.getName());
    }
}
