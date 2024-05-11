package ru.job4j.collection;

import java.util.Comparator;

public class JobSortByNameLength implements Comparator<Job> {
    @Override
    public int compare(Job left, Job right) {
        return Integer.compare(left.getName().length(), right.getName().length());
    }
}
