// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;

class bca{
    String name;
    int age;
    int marks;

    public static void main(String args[]){
        bca b=new bca();
        b.add();
        b.display();
    }
void add(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Name : ");
    name =sc.nextLine();
    System.out.println("Enter the Age  :");
    age=sc.nextInt();
    
    System.out.println("Enter the Marks :");
    marks=sc.nextInt();
    }
    void display() {
        System.out.println("\nName   : "+name );
        System.out.println("Age    : "+age );
        System.out.println("Marks  : "+marks );
        }
}