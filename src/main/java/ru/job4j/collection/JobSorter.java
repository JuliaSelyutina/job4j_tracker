package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        Comparator<Job> combine = new JobSortDescByNameLength()
                .thenComparing(new JobSortDescByName())
                .thenComparing(new JobSortDescByPriority());
        System.out.println(jobs);
        System.out.println("Sorted by priority^");
        Collections.sort(jobs);
        System.out.println(jobs);
        System.out.println("Sorted by job name:");
        Collections.sort(jobs, new JobSortByName());
        System.out.println(jobs);
        System.out.println("Sorted by job name DESC:");
        jobs.sort(new JobSortDescByName());
        System.out.println(jobs);
        System.out.println("Sorted by job name length DESC, by job name DESC, by job priority DESC:");
        Collections.sort(jobs, combine);
        System.out.println(jobs);
    }
}
