import books.Book;
import books.BookManager;
import transactions.Transaction;
import transactions.TransactionManager;
import users.User;
import users.UserManager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Test the library management system

        // Books
        BookManager bookManager = new BookManager();
        Book book1 = new Book("Title1", "Author1", "1234567890", "Genre1");
        Book book2 = new Book("Title2", "Author2", "0987654321", "Genre2");
        bookManager.addBook(book1);
        bookManager.addBook(book2);

        System.out.println("All Books:");
        bookManager.displayBooks();

        System.out.println("\nSearch by Title:");
        Book searchedBook = bookManager.searchByTitle("Title2");
        if (searchedBook != null) {
            System.out.println("Book found: " + searchedBook);
        } else {
            System.out.println("Book not found");
        }

        // Users
        UserManager userManager = new UserManager();
        User user1 = new User("John Doe", "1234", "Student");
        User user2 = new User("Jane Smith", "5678", "Faculty");
        userManager.addUser(user1);
        userManager.addUser(user2);

        System.out.println("\nAll Users:");
        userManager.displayUsers();

        System.out.println("\nSearch by Name:");
        User searchedUser = userManager.searchByName("Jane Smith");
        if (searchedUser != null) {
            System.out.println("User found: " + searchedUser);
        } else {
            System.out.println("User not found");
        }

        // Transactions
        TransactionManager transactionManager = new TransactionManager();
        Transaction transaction1 = new Transaction("1", "1234", "1234567890", "Borrow", new Date());
        Transaction transaction2 = new Transaction("2", "5678", "0987654321", "Return", new Date());
        transactionManager.addTransaction(transaction1);
        transactionManager.addTransaction(transaction2);

        System.out.println("\nAll Transactions:");
        transactionManager.displayTransactions();

        System.out.println("\nTransactions by User ID:");
        System.out.println(transactionManager.getTransactionsByUserID("1234"));
    }
}
