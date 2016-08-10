package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

    static String SOURCE = "The oldest oldest oldest oldest oldest classical Greek Greek Greek and Latin writing had little or no space between words".toUpperCase();
    WordCount wordCount = new WordCount();

    @Before
    public void parse() {
        String[] words = SOURCE.split("\\W+"); // should take care of
                                               // punctuation and other special
                                               // characters
        for (String word : words) {
            this.wordCount.addWord(word);

        }

    }

    @Test
    public void test() {
        assertEquals("", 5, wordCount.count("OLDEST"));
        assertEquals("", 3, wordCount.count("GREEK"));
        wordCount.top(5);
        wordCount.bottom(5);
        WordCount.source();
        assertEquals("", "The oldest oldest oldest oldest oldest classical Greek Greek Greek and Latin writing had little or no space between words".toUpperCase(), WordCount.source());
    }

}
