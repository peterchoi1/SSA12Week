package com.tiy.ssa.weektwo.assignmentone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {

    public static List<Food> match(List<Food> one, List<Food> other) {

        List<Food> foodList = new ArrayList();

        Iterator<Food> listOne = one.iterator();

        while (listOne.hasNext()) {
            Food food = listOne.next();

            if (other.contains(food)) {
                foodList.add(food);
            }

        }

        return foodList;

    }

    public static List<String> descendingBySize(List<String> input) {
        Collections.sort(input, Collections.reverseOrder());
        return input;
    }

}
