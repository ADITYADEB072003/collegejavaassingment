import java.io.*;


public class chartstream {
    public static void main (String args[]){
    String source=args[0];
    String destination=args[1];
    try{
        FileReader fis=new FileReader(source);
        FileWriter fos =new FileWriter(destination);
        int c;
        while((c=fis.read())!=-1){
            fos.write(c);
            
        }
        fis.close();
        fos.close();
            System.out.println("FILE COPIED SUCCESSFULLY");
    }catch(IOException e){
        System.out.println("FILE COPIED UNSUCCESSFULLY");
    }
    
}
}