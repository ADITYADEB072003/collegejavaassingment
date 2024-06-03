import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class bytestream{


    public static void main(String args[]){

        String source=args[0];
        String destination=args[1];
        try{
            FileInputStream fis=new FileInputStream(source);
            FileOutputStream fos=new FileOutputStream(destination);
            int c= fis.available();
            byte [] buffer=new byte[c];
            int c1;
            while((c1=fis.read(buffer))>0){
                fos.write(buffer,0,c);
            }
            fis.close();
            fos.close();
            System.out.println("FILE COPIED SUCCESSFULLY");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}