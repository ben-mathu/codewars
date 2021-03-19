public class StrUtils {
    public static String toCapCase(String s) {
      
        StringBuilder sb = new StringBuilder(s);
        if (s.equals("")) {
          return "";
        } else if (s.contains("^[0-9]$")) {
          return s;
        } else {
          boolean isSpace = false;
          if (String.valueOf(s.charAt(0)).matches("[a-z]")) {
            sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
            }
          for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("\\s+")) {
              isSpace = true;
              continue;
            }
            
            if (isSpace) {
              sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
              isSpace = false;
            }
          }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(StrUtils.toCapCase("ab	cd"));
    }
}