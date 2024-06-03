 import java.util.*;
 class array {
    int[][] a;
    int [][] b;
    int [] [] summatric;
    int [] [] submatric;
    int [] [] mulmatric;
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
        a = new int[r][c];
        b=new int[r] [c];
        System.out.println("Enter the ELEMENT OF A ");
        // Initialize the array after getting rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = a1.nextInt();
            }
        }
        System.out.println("Enter the ELEMENT OF B ");
        // Initialize the array after getting rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = a1.nextInt();
            }
        }
    }

    void display() {
        System.out.println("Enter the ELEMENT OF A ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the ELEMENT OF B ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
void addMatrices(){
    summatric=new int [r][c];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            summatric[i][j]= a[i][j] + b[i][j];
            }
            }
            System.out.println("Sum of the two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(summatric[i][j] + " ");
            }
            System.out.println();
        }
            }

void subMatrices(){
    submatric=new int [r][c];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            submatric[i][j]= a[i][j] - b[i][j];
            }
            }
            System.out.println("SUB of the two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(submatric[i][j] + " ");
            }
            System.out.println();
        }
            }
           

                        void mulMatrices() {
                            mulmatric = new int[r][c];
                            for (int i = 0; i < r; i++) {
                                for (int j = 0; j < c; j++) {
                                    mulmatric[i][j] = 0;
                                    for (int k = 0; k < c; k++) {
                                        mulmatric[i][j] += a[i][k] * b[k][j];
                                    }
                                }
                            }
                            System.out.println("Multiplication of the two matrices is: ");
                            for (int i = 0; i < r; i++) {
                                for (int j = 0; j < c; j++) {
                                    System.out.print(mulmatric[i][j] + " ");
                                }
                                System.out.println();
                            }
                        }
}








public class array2 {
    public static void main(String[] args) {
        array  a =new array();
        a.input();
        a.display();
        a.addMatrices();
        a.subMatrices();
        a.mulMatrices();
    }
}
