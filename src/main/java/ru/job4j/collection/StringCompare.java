package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int compareResult;
        Integer compareLength;

        if (left == null && right == null) {
            return  0;
        }
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }
        compareLength = Math.min(left.length(), right.length());

        for (int index = 0; index < compareLength; index++) {
            compareResult = Character.compare(left.charAt(index), right.charAt(index));
            if (compareResult != 0) {
                return compareResult;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
