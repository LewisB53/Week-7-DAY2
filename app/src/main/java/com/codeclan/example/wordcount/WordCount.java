package com.codeclan.example.wordcount;

/**
 * Created by user on 23/05/2017.
 */

public class WordCount {

    public String getWord() {
        return "word";
    }

    public String SplitWords(String words) {
        String[] result = words.split(" ");
        return result[1];
    }



    public int NumberofWords(String words) {
        String[] result = words.split(" ");
        return result.length;
    }
}
