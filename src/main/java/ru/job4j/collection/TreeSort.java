package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        Set<Integer> newNumbers = new TreeSet<>(Collections.reverseOrder());
        newNumbers.add(5);
        newNumbers.add(1);
        newNumbers.add(3);
        System.out.println(newNumbers);
    }
}
