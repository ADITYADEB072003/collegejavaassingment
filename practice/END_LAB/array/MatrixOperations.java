import java.util.Scanner;

class array {
    int[][] a;
    int r;
    int c;
    int sumrows = 0;
    int sumcols = 0;
    int sum = 0;
    int sumdiag = 0;
    int maindiagonal = 0;
    int reversediagonl = 0;
    Scanner a1 = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number of rows");
        r = a1.nextInt();
        System.out.println("Enter the number of columns");
        c = a1.nextInt();
        a = new int[r][c]; // Initialize the array after getting rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = a1.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void findelement(int x) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("The element is present at " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Element not found.");
    }

    void replace(int x, int y) {
        boolean replaced = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    a[i][j] = y;
                    replaced = true;
                }
            }
        }
        if (replaced) {
            System.out.println("Element replaced.");
        } else {
            System.out.println("Element not found.");
        }
    }

    void sumrows() {
        for (int i = 0; i < r; i++) {
            sumrows = 0;
            for (int j = 0; j < c; j++) {
                sumrows += a[i][j];
            }
            System.out.println("The sum of the elements in row " + i + " is " + sumrows);
        }
    }

    void sumcols() {
        for (int j = 0; j < c; j++) {
            sumcols = 0;
            for (int i = 0; i < r; i++) {
                sumcols += a[i][j];
            }
            System.out.println("The sum of the elements in column " + j + " is " + sumcols);
        }
    }

    void sumOfDiagonals() {
        if (r != c) {
            System.out.println("The matrix is not a square matrix, cannot calculate diagonals.");
            return;
        }
        sumdiag = 0;
        for (int i = 0; i < r; i++) {
            sumdiag += a[i][i];
        }
        System.out.println("The sum of the elements in the main diagonal is " + sumdiag);
    }

    void sumofantidiagonal() {
        if (r != c) {
            System.out.println("The matrix is not a square matrix");
            return;
        }
        maindiagonal = 0;
        reversediagonl = 0;
        for (int i = 0; i < r; i++) {
            maindiagonal += a[i][i];
            reversediagonl += a[i][r - i - 1];
        }
        System.out.println("Sum of main diagonal: " + maindiagonal);
        System.out.println("Sum of anti-diagonal: " + reversediagonl);
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        array a = new array();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Input matrix");
            System.out.println("2. Display matrix");
            System.out.println("3. Find element");
            System.out.println("4. Replace element");
            System.out.println("5. Sum of rows");
            System.out.println("6. Sum of columns");
            System.out.println("7. Sum of main diagonal");
            System.out.println("8. Sum of anti-diagonal");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    a.input();
                    break;
                case 2:
                    a.display();
                    break;
                case 3:
                    System.out.print("Enter the element to find: ");
                    int findElement = scanner.nextInt();
                    a.findelement(findElement);
                    break;
                case 4:
                    System.out.print("Enter the element to replace: ");
                    int oldElement = scanner.nextInt();
                    System.out.print("Enter the new element: ");
                    int newElement = scanner.nextInt();
                    a.replace(oldElement, newElement);
                    break;
                case 5:
                    a.sumrows();
                    break;
                case 6:
                    a.sumcols();
                    break;
                case 7:
                    a.sumOfDiagonals();
                    break;
                case 8:
                    a.sumofantidiagonal();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
