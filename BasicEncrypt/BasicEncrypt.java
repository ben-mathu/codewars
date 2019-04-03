import java.util.Map;
import java.util.HashMap;

public class BasicEncrypt {
    private String asciiChars = "NUL SOH STX ETX EOT ENQ ACK BEL BS HT LF VT FF CR SO SI DLE DC1 DC2 DC3 DC4 NAK SYN ETB CAN EM SUB ESC FS GS RS US  ! \" # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \\ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } ~  €  ‚ ƒ „ … † ‡ ˆ ‰ Š ‹ Œ  Ž   ‘ ’ “ ” • – — ˜ ™ š › œ  ž Ÿ  ¡ ¢ £ ¤ ¥ ¦ § ¨ © ª « ¬  ® ¯ ° ± ² ³ ´ µ ¶ · ¸ ¹ º » ¼ ½ ¾ ¿ À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö × Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ÷ ø ù ú û ü ý þ ÿ"; 

    public String encrypt(String text, int rule) {
        
        char[] asciiArrChars = new char[256];
        for (int i = 0; i < asciiArrChars.length; i++) {
            asciiArrChars[i] = (char) i;
        }

        if (text.isEmpty())
            return "";
            
        if (rule < 1)
            return text;
        
        String output = "";
        
        for (int i = 0; i < text.length(); i++) {
            int temp = 0;
            for (int k = 0; k < asciiArrChars.length; k++) {
                if (text.charAt(i) == asciiArrChars[k]) {
                    temp = k;
                }
            }
            
            temp += rule;
            if (temp > 255) {
                temp %= 256;
            }
            output += Character.toString((char) temp);
        }
        return output;
    }

    public static void main(String[] args) {
        BasicEncrypt basicEncrypt = new BasicEncrypt();
        System.out.println(basicEncrypt.encrypt("please encrypt me", 2));
    }
}