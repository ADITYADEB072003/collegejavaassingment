// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;

class MyMatrix {
    private int[][][] matrices;
    private int rows;
    private int cols;

    public MyMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrices = new int[3][rows][cols];
    }

    public void fillMatrix(int matrixIndex) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for matrix " + matrixIndex + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrices[matrixIndex][i][j] = scanner.nextInt();
            }
        }
    }

    public void displayMatrix(int matrixIndex) {
        System.out.println("Matrix " + matrixIndex + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrices[matrixIndex][i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addMatrices() {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrices[0][i][j] + matrices[1][i][j] + matrices[2][i][j];
            }
        }
        displayResultMatrix(result);
    }

    public void subtractMatrices() {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrices[0][i][j] - matrices[1][i][j] - matrices[2][i][j];
            }
        }
        displayResultMatrix(result);
    }

 
        public void multiplyMatrices() {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int product = 1;
                    for (int k = 0; k < 3; k++) {
                        product *= matrices[k][i][j];
                    }
                    result[i][j] = product;
                }
            }
            displayResultMatrix(result);
        }
        

    private void displayResultMatrix(int[][] result) {
        System.out.println("Result Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        MyMatrix myMatrix = new MyMatrix(rows, cols);
// to iterate over the matrix[];
        for (int i = 0; i < 3; i++) {
            myMatrix.fillMatrix(i);
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Matrices");
            System.out.println("2. Add Matrices");
            System.out.println("3. Subtract Matrices");
            System.out.println("4. Multiply Matrices");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        myMatrix.displayMatrix(i);
                    }
                    break;
                case 2:
                    myMatrix.addMatrices();
                    break;
                case 3:
                    myMatrix.subtractMatrices();
                    break;
                case 4:
                    myMatrix.multiplyMatrices();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
