// DC2022BCA0004
/*create a java program 
1.which is capable of storing a string 
2.spiliting the string into words , 
3.covert the string uppercase and lowercase ,
 4.convert the string to proper case string*/
import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        // Storing a string
        String inputString = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original String: " + inputString);

        // Splitting the string into words
        String[] words = inputString.split("\\s+`");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
}

        // Converting the string to uppercase
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseString);

        // Converting the string to lowercase
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseString);

        // Create an instance of StringManipulation
        StringManipulation stringManipulation = new StringManipulation();

        // Converting the string to proper case
        String properCaseString = stringManipulation.toProperCase(inputString);
        System.out.println("Proper Case String: " + properCaseString);
    }

    // Helper method to convert a string to proper case
    public String toProperCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean nextUpperCase = true;

        for (char c : str.toCharArray()) {
           
            if (Character.isWhitespace(c)) {
                sb.append(c);
                nextUpperCase = true;
            } else if (nextUpperCase) {
                sb.append(Character.toUpperCase(c));
                nextUpperCase = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}
