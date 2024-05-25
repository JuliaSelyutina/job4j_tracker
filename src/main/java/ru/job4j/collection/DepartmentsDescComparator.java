package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String leftElement = left.split("/")[0];
        String rightElement = right.split("/")[0];
        if (rightElement.compareTo(leftElement) == 0) {
            leftElement = left.substring(leftElement.length() - 1);
            rightElement = right.substring(rightElement.length() - 1);
            return leftElement.compareTo(rightElement);
        }
        return rightElement.compareTo(leftElement);
    }
}
