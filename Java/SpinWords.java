import java.util.ArrayList;
import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args) {
        // String sentence = args[0];
        String spinnedSentence = SpinWords.spinWords("Stop gninnipS My sdroW!");
        System.out.println("Spinned sentence: " + spinnedSentence);
        assert("Stop spinning My words!".equals(spinnedSentence));

        spinnedSentence = SpinWords.spinWords("Welcome");
        System.out.println("Spinned sentence: " + spinnedSentence);
        assert("emocleW".equals(spinnedSentence));
        
        spinnedSentence = SpinWords.spinWords("Hey fellow warriors");
        System.out.println("Spinned sentence: " + spinnedSentence);
        assert("Hey wollef sroirraw".equals(spinnedSentence));
    }

    public static String spinWords(String sentence) {
        // get word count
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(sentence.split(" ")));

        String spinnedSentence = "";
        int length = wordList.size();
        int wordCount = 1;
        for (String word: wordList) {
            int letterCount = word.length();
            if (letterCount >= 5) {
                word = spin(word);
            }

            if (wordCount != length) {
                System.out.println("Word: " + word);
                spinnedSentence += word + " ";
            } else {
                spinnedSentence += word;
            }

            wordCount++;
        }

        return spinnedSentence;
    }

    private static String spin(String word) {
        String spinned = "";
        String temp = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            String charStr = String.valueOf(word.charAt(i));
            if (charStr.matches("[a-zA-Z]")) {
                spinned += word.charAt(i);
            } else {
                temp = charStr;
            }
        }

        return spinned += temp;
    }
}
