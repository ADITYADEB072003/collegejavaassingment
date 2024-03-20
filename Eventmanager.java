import java.util.Scanner;

class Eventmanager {
    String[] name = new String[10];
    String[] date = new String[10];
    String[] time = new String[10];
    int noOfEvents = 0;

    void addEvent(String n, String d, String t) {
        name[noOfEvents] = n;
        date[noOfEvents] = d;
        time[noOfEvents] = t;
        System.out.println("Event added Successfully");
        noOfEvents++;
    }

    void editEvent(int n, String d, String t,String r) {
        if (n < 0 || n >= noOfEvents) {
            System.out.println("Invalid event number");
            return;
        } else {
            name[n] = d;
            date[n] = t;
            time[n]=r;
            System.out.println("Event Edited successfully");
        }
    }

    void display() {
        for (int i = 0; i < noOfEvents; i++) {
            System.out.println("\nEvent " + (i + 1) + " Details:");
            System.out.println("Name: " + name[i]);
            System.out.println("Date: " + date[i]);
            System.out.println("Time: " + time[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Eventmanager eventManager = new Eventmanager();

        do {
            System.out.println("****MENU****");
            System.out.println("1. Add Event");
            System.out.println("2. Display Event Details");
            System.out.println("3. Edit Event");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter the Time: ");
                    String time = scanner.nextLine();
                    eventManager.addEvent(name, date, time);
                    break;
                case 2:
                    eventManager.display();
                    break;
                case 3:
                    System.out.print("Enter the event number to update: ");
                    int eventNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter the New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter the New Date: ");
                    String newDate = scanner.nextLine();
                    System.out.print("Enter the New Time: ");
                    String newTime = scanner.nextLine();
                    eventManager.editEvent(eventNumber - 1, newName, newDate, newTime);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        
    }
}
