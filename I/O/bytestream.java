import java.io.*;

class bytestream {
    public static void main(String args[]) {
        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
            int n = fis.available();
            byte[] buffer = new byte[n];

            int char;
            while ((char = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, char);
            }

            fis.close();
            fos.close();
            System.out.println("FILE COPIED SUCCESSFULLY");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
