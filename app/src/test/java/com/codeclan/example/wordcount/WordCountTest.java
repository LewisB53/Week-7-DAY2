package com.codeclan.example.wordcount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/05/2017.
 */

public class WordCountTest {

    @Test
    public void canReturnString() {
        WordCount wordcount = new WordCount();
        assertEquals("word", wordcount.getWord());
    }

    @Test
    public void canSplitWords() {
        WordCount wordcount = new WordCount();
        assertEquals("than" , wordcount.SplitWords("more than one word"));
    }

    @Test
    public void canCountWords() {
        WordCount wordcount = new WordCount();
        assertEquals(4, wordcount.NumberofWords("more than one word"));
    }

}
