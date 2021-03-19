import java.util.Random;
import java.math.BigInteger;

public class StripComments {
    private static final Random RANDOM = new Random();

	public static String stripComments(String text, String[] commentSymbols) {
        String stringComments = "";
        for (int i = 0; i < commentSymbols.length; i++) {
            stringComments += commentSymbols[i];
        }
        String[] elementsWithNewLine = text.split("\n");
        String replacedString = "";
        for (int i = 0; i < elementsWithNewLine.length; i++) {
            replacedString += elementsWithNewLine[i]
                .replaceAll("[ ]*([" + stringComments + "].*)?$", "");
            if (i != elementsWithNewLine.length - 1) {
                replacedString += "\n";
            }
        }
        return replacedString;
	}

    public static void main(String[] args) {
        String clearText = StripComments.stripComments(
            "apples, pears # and bananas\ngrapes\nbananas !apples",
            new String[] { "#", "!" });
        System.out.println(clearText);

        String[] comments = { "#", "$", "!", "-" };

        String test = randomString().replace( "1", comments[RANDOM.nextInt( 4 )] )
          .replace( "0", "\n" )
          .replaceAll( "\n+$", "" );

        System.out.println(test);
    }

    private static String randomString() {
        return new BigInteger( 1000, RANDOM ).toString( 16 )
            .replaceAll( "[2-9]+", "\n\n" );
    }
	
}