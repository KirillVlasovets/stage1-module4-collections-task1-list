package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        var list = new ArrayList<String>();
        for (var i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                list.add(sourceList.get(i));
                list.add(sourceList.get(i));
            }
        }
        return list;
    }
}
