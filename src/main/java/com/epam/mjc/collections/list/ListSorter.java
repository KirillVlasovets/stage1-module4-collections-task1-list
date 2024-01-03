package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        var intA = Integer.parseInt(a);
        var intB = Integer.parseInt(b);
        var res = Integer.compare((int) (5 * Math.pow(intA, 2) + 3), (int) (5 * Math.pow(intB, 2) + 3));
        if (res == 0) {
            return Integer.compare(intA, intB);
        }
        return Integer.compare((int) (5 * Math.pow(Integer.parseInt(a), 2) + 3),
                (int) (5 * Math.pow(Integer.parseInt(b), 2) + 3));
    }
}
