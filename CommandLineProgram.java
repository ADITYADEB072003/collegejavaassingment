public class CommandLineProgram {
    public static void main(String[] ar) {
        // Checking if any command-line arguments are provided
        if (ar.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Iterating over the command-line arguments and printing them
            for (int i = 0; i < ar.length; i++) {
                System.out.println((i + 1) + ": " + ar[i]);
            }
        }
    }
}