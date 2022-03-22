package practice.regex;

public class SplitText {

    public static void main(String[] args) {
        String text = "the level of lifespan-is-kek higher. than? it! was 40 years ago.";
        System.out.println(splitTextIntoWords(text));

    }

    public static String splitTextIntoWords(String text) {
        if (text.equals("")) {
            return "";
        }
        text = text.replaceAll("\\d", "");
        String[] words = text.split("\\s\\s|\\s|\\.\\s|\\;\\s|\\?\\s|\\,\\s|\\-|\\.");
        String splitWords = words[0];
        for (int i = 1; i < words.length; i++) {
            splitWords += System.lineSeparator() + words[i];
        }
        return splitWords;
    }

}