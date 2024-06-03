import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class vowel {
public static void main (String args[]){
    File f=new File(args[0]);
    int vowel=0;
    int consonant=0;
    int special=0;
    int white=0;
    try{
        if(f.exists()){
          FileReader r=new FileReader(f);
            int c;
            while((c=r.read())!=-1){
                char c1=(char)c;
                char upper=Character.toUpperCase(c1);
                char lower=Character.toLowerCase(upper);
                if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u'){
                    vowel++;
                }
                else if(Character.isLetter(lower)){
                    consonant++;
                }
                else if(Character.isWhitespace(lower)){
                    white++;
                }
                else{
                    special++;
                }
                System.out.println(upper);
            }
            System.out.println("Vowels:"+vowel);
            System.out.println("Consonants:"+consonant);
            System.out.println("Special Characters:"+special);
            System.out.println("White Spaces:"+white);
            
            }

        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}    
    

