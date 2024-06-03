

import java.util.Arrays;

public class string2 {
   
    public static void main(String[] args) {
        string2 obj = new string2();
        String str = "hello world this is a test STRING";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String [] words =str.split("\\s+");
        System.out.println("Split String: " + Arrays.toString(words));

        StringBuilder properCaseString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                properCaseString.append(Character.toUpperCase(word.charAt(0)));
                properCaseString.append(word.substring(1).toLowerCase());
                properCaseString.append(" ");
            }
        }
        System.out.println(properCaseString.toString());
      
    }
}
