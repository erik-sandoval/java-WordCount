package wordcount;

import java.util.*;

public class WordCounter{

    private String text;

    public WordCounter(String text) {
        this.text = text;
    }

    private String stripSpecialCharacters(String text) {
        return text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
    }

    private String[] indexText(String text) {
        String[] words = text.split(" +");
        return words;
    }

    public String getWordCount() {
        String word = stripSpecialCharacters(this.text);
        return "this document has " + indexText(this.text).length + " words.";
    }

    public HashMap<String, Integer> getWordFrequency() {
        String words = stripSpecialCharacters(this.text);

        String[] wordArr = indexText(words);
        
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