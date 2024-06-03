import java.io.*;

class RandomAccessFileDemo {
    public static void main(String args[]) {
        try {
            String fileName = "src.txt";

            // Appending contents to the file
            String content = "\nContents appended using RandomAccessFile";
            try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
                raf.seek(raf.length());
                raf.writeBytes(content);
            }

            // Reading the contents of the file
            System.out.println("Reading the contents of the file...");
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
