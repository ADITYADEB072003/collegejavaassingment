// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;

class MyArray {
    private int[][] a;
    private int r;
    private int c;

    public void initialise_a() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        c = scanner.nextInt();
        a = new int[r][c];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public void display_a() {
        System.out.println("Array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void sumOfRows() {
        System.out.println("Sum of each row:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    public void sumOfColumns() {
        System.out.println("Sum of each column:");
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum +=a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }
    public void sumOfAllElements() {
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
    public void sumOfDiagonals() {
        if (r != c) {
            System.out.println("The matrix is not a square matrix. Diagonals cannot be calculated.");
            return;
        }
int maindiagonal=0;
int reversediagonl=0;
for(int i=0; i<r; i++) {
    maindiagonal+=a[i][i];
    reversediagonl+=a[i][r-i-1];
}
System.out.println("Sum of main diagonal : "+maindiagonal);
System.out.println("Sum of anti-diagonal: " + reversediagonl);



}
}

public class TestMyArray1 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.initialise_a();
        myArray.display_a();

        myArray.sumOfRows();
        myArray.sumOfColumns();
        myArray.sumOfAllElements();
        myArray.sumOfDiagonals();


    }
}
