package com.tiy.ssa.weektwo.assignmentthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    /**
     * 
     * @param word
     *            callers are responsible for ensuring <code>word</code> <br>
     *            is an actual word, parsing is done by the caller
     */

    Map<String, Integer> wordList = new HashMap<>();

    public void addWord(String word) {

        // TODO
        if (wordList.containsKey(word)) {
            wordList.replace(word, wordList.get(word) + 1);
        }

        if (!wordList.containsKey(word)) {
            wordList.put(word, 1);

        }

    }

    public int count(String word) {

        return wordList.get(word);

    }

    public List<String> top(int many) {

        List list = new ArrayList(wordList.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object obj1, Object obj2) {
                return ((Comparable) ((Map.Entry) (obj2)).getValue()).compareTo(((Map.Entry) (obj1)).getValue());
            }
        });
        System.out.println(list.subList(0, many));
        return list.subList(0, many);

    }

    public List<String> bottom(int many) {

        List list = new ArrayList(wordList.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object obj1, Object obj2) {
                return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
            }
        });
        System.out.println(list.subList(0, many));
        return list.subList(0, many);

    }

    public static String source() {
        return WordCountTest.SOURCE;
    }
}
