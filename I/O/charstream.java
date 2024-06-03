import java.io.*;

class charstream {
    public static void main(String args[]) {
        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);
            int c;

            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            reader.close();
            writer.close();
            System.out.println("FILE COPIED SUCCESSFULLY");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
