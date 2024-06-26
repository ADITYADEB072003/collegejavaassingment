// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;

class MyArray {
    public int[][] a;
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

   

    public void findEle(int x) {
        System.out.println("Indices of value " + x + ":");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("[" + i + "][" + j + "]");
                }
            }
        }
    }
public void bubble(int [][] matrix){
    int temp;
    int i,j,k;
    int ROW=r;
    int COL=c;
    for (i = 0; i < COL; i++) {
        for (j = 0; j < ROW; j++) {
          for (k = j+1; k < ROW; k++) {
            if (matrix[i][j] > matrix[i][k]) {
              // swap elements
              temp = matrix[i][j];
              matrix[i][j] = matrix[i][k];
              matrix[i][k] = temp;
            }
          }
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
    public void replaceEle(int x, int y) {
        System.out.println("Replacing " + x + " with " + y + ":");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    a[i][j] = y;
                }
            }
        }
        display_a();
    }
}

public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.initialise_a();
        myArray.display_a();
        myArray.bubble(myArray.a);
        myArray.display_a();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to find: ");
        int findValue = scanner.nextInt();
        myArray.findEle(findValue);

        System.out.print("Enter the value to replace: ");
        int replaceValue = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        myArray.replaceEle(replaceValue, newValue);
    }
}
