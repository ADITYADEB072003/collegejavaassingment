import java.io.*;

class V {
    public static void main(String args[]) {
        File f = new File(args[0]);
        int n;
        
        try {
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                System.out.println("Converting uppercase each character");
                
                while ((n = fr.read()) != -1) {
                    char c = (char) n;
                    System.out.print(Character.toUpperCase(c));
                }
                
                fr.close();
            } else {
                System.out.println("FILE DOES NOT EXIST");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
