package wordcount;

import java.util.*;

public class WordCounter{

    private String text;

    public WordCounter(String text) {
        this.text = text;
    }

    private String[] stripSpecialCharactersAndIndex(String text) {
        return text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "").split(" +");
    }

    public String getWordCount() {
        String[] word = stripSpecialCharactersAndIndex(this.text);
        return "this document has " + word.length + " words.";
    }

    public HashMap<String, Integer> getWordFrequency() {
        

        String[] wordArr = stripSpecialCharactersAndIndex(this.text);
        
        HashMap<String, Integer> wordDict = new HashMap<String, Integer>();

        for (String word : wordArr) {
            if (!wordDict.containsKey(word)) {
                wordDict.put(word, 1);
            } else {
                int value = wordDict.get(word);
                wordDict.replace(word, value + 1);
            }
        }

        return wordDict;
    }
}