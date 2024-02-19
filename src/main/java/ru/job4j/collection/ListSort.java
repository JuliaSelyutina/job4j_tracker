package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        List<Integer> listNew = Arrays.asList(6, 7, 5, 3, 4, 1, 2);
        System.out.println(listNew);
        Collections.sort(listNew, Collections.reverseOrder());
        System.out.println(listNew);
    }
}
