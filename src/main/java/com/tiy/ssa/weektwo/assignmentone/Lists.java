package com.tiy.ssa.weektwo.assignmentone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lists {

    private Lists() {
    }

    public static <T> List<T> match(List<T> one, List<T> other) {

        // List<T> newList = new ArrayList<>();

        Set<T> newHashList = new HashSet<>();

        Iterator<T> listOne = one.iterator();

        while (listOne.hasNext()) {
            T item = listOne.next();

            if (other.contains(item)) {
                newHashList.add(item);
            }

        }

        return new ArrayList<T>(newHashList);

    }

    public static List<String> descendingBySize(List<String> input) {

        List<String> newList = input;
        List<String> temp = new ArrayList<>();

        for (int x = 0; x < newList.size(); x++) {
            for (int i = 1; i < newList.size(); i++) {
                temp.clear();
                if (newList.get(i - 1).length() < newList.get(i).length()) {
                    temp.add(newList.get(i - 1));
                    newList.set(i - 1, newList.get(i));
                    newList.set(i, temp.get(0));
                }
            }
        }

        return newList;

    }

}
