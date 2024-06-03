            import java.io.*;

            class BinaryFileCopy {
            public static void main(String args[]) {
            if (args.length != 2) {
            System.out.println("Usage: java BinaryFileCopy <source file> <destination file>");
            return;
            }

            String sourceFile = args[0];
            String destinationFile = args[1];

            try  {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile));
                int c=bis.available();
                byte[] buffer = new byte[c];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }

                        System.out.println("FILE COPIED SUCCESSFULLY");
            } catch (IOException e) {
                        System.out.println("Error copying file: " + e.getMessage());
            }
            }
            }
