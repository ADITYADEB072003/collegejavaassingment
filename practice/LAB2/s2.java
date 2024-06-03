

import java.util.Scanner;

public class s2 {
    
    public static void main(String[] args) {
        int vowel=0;
        Scanner a=new Scanner(System.in);
        String line=a.nextLine();
        
        for(char c:line.toLowerCase().toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
       
        }

        System.out.println("VOWEL="+vowel);
}
}