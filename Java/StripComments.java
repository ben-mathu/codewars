import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
        Pattern pattern;
        Matcher matcher;

        String replacedString = "";
        String[] elementsWithNewLine = text.split("\n");
        for (int j = 0; j < elementsWithNewLine.length; j++) {
            for (int i = 0; i < commentSymbols.length; i++) {
                pattern = Pattern.compile("(\\w+[,.]+ \\w+) (" + commentSymbols[i] + " \\w+( \\w+)+\n)");
                matcher = pattern.matcher(elementsWithNewLine[j]);
    
                if (matcher.find()) {
                    replacedString += matcher.group(1).trim() + "\n";
                } else {
                    replacedString += elementsWithNewLine[j] + "\n";
                }
            }
        }
		return replacedString;
	}

    public static void main(String[] args) {
        System.out.println(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
    }
	
}