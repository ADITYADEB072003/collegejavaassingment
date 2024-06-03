import java.util.Scanner;

class s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int count = 0;

        System.out.println("Enter lines (type 'good bye' to stop):");

        while (true) {
            line = scanner.nextLine();
            String a=line.toLowerCase();
            if (a.equalsIgnoreCase("good bye")) break;

            if (a.contains("india") || a.contains("hello")) {
                System.out.println(line);
                count++;
            }
        }

        System.out.println("Total lines containing 'India' or 'Hello': " + count);
    }
}
