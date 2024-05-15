package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(intExtractorFromString(left), intExtractorFromString(right));
    }

    private int intExtractorFromString (String value) {
        String newValue = "";
        String[] words = value.split("\\.");
        for (String word : words) {
            newValue += word.replaceAll("[^0-9]+", "");
        }
        return Integer.parseInt(newValue);
    }
}
