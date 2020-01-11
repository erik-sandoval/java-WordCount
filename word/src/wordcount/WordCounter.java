package wordcount;

public class WordCounter{

    private String text;

    public WordCounter(String text) {
        this.text = text;
    }

    private String stringSpecialCharacters(String text) {
        return text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
    }

    private String[] indexText(String text) {
        String[] words = text.split(" +");
        return words;
    }

    public String getWordCount() {
        String word = stringSpecialCharacters(this.text);
        return "this document has " + indexText(this.text).length + " words.";
    }
}