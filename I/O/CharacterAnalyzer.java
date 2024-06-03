import java.io.*;

public class CharacterAnalyzer {
    public static void main(String args[]) {
        File file = new File(args[0]);
        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialCharsCount = 0;
        int whiteSpacesCount = 0;
        
        try {
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                int character;

                while ((character = fileReader.read()) != -1) {
                    char ch = Character.toUpperCase((char) character);
                     char ch1 = Character.toLowerCase(ch);
                    if (ch1 == 'a' || ch1== 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                        vowelsCount++;
                    } else if (Character.isLetter(ch)) {
                        consonantsCount++;
                    } else if (Character.isWhitespace(ch)) {
                        whiteSpacesCount++;
                    } else {
                        specialCharsCount++;
                    }
                }

                fileReader.close();

                System.out.println("Total vowels: " + vowelsCount);
                System.out.println("Total consonants: " + consonantsCount);
                System.out.println("Total special characters: " + specialCharsCount);
                System.out.println("Total whitespace characters: " + whiteSpacesCount);
                System.out.println(ch);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    
  
}
