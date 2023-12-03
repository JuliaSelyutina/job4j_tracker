package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> newTasks) {
        HashSet<String> tasks = new HashSet<>();
        for (Task task : newTasks) {
            tasks.add(task.getNumber());
        }
        return tasks;
    }
}
