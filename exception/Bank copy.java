import java.util.Scanner;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Bank {

    String[] accountHolder = new String[10];
    int[] accountNo = new int[10];
    int[] deposit = new int[10];
    int[] withdraw = new int[10];

    int index = 0;

    void accountName(String a, int b) {
        accountHolder[index] = a;
        accountNo[index] = b;
        index++;
    }

    void depositAmount(int a) throws InvalidAmountException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int p = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            if (accountNo[i] == p) {
                System.out.println("Enter the amount to deposit: ");
                int o = scanner.nextInt();
                if (o <= 0) {
                    throw new InvalidAmountException("Deposit amount must be positive.");
                }
                deposit[i] += o;
                break;
            }
        }
    }

    void withdrawAmount() throws InsufficientFundsException, InvalidAmountException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int p = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            if (accountNo[i] == p) {
                System.out.println("Enter the amount to withdraw: ");
                int o = scanner.nextInt();
                if (o <= 0) {
                    throw new InvalidAmountException("Withdrawal amount must be positive.");
                }
                if (deposit[i] - o < 0) {
                    throw new InsufficientFundsException("Insufficient balance!");
                }
                withdraw[i] += o;
                deposit[i] -= o;
                break;
            }
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Details:");
        for (int i = 0; i < index; i++) {
            System.out.println("Account Holder: " + accountHolder[i]);
            System.out.println("Account Number: " + accountNo[i]);
            System.out.println("Deposit Amount: " + deposit[i]);
            System.out.println("Withdraw Amount: " + withdraw[i]);
        }
    }

    public static void main(String args[]) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    bank.accountName(name, accNumber);
                    break;
                case 2:
                    try {
                        bank.depositAmount(0);
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        bank.withdrawAmount();
                    } catch (InsufficientFundsException | InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    bank.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
