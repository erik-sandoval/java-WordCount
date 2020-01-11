package wordcount;

public class wordcounter{

    String text;

    public WordCounter(String text) {
        this.text = text;
    }

    public String stringSpecialCharacters() {
        return text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
    }

    
}