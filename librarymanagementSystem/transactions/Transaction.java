package transactions;

import java.util.Date;

public class Transaction {
    private String transactionID;
    private String userID;
    private String bookISBN;
    private String transactionType;
    private Date transactionDate;

    public Transaction(String transactionID, String userID, String bookISBN, String transactionType, Date transactionDate) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.bookISBN = bookISBN;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", userID='" + userID + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
