// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;


class employee{
    String name;
    int age;
    String gender;

    public static void main(String args[]){
    employee b=new employee();
        b.add();
        b.display();
    }
void add(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Name : ");
    name =sc.nextLine();
    System.out.println("Enter the Age  :");
    age=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the GENDER :");
    gender=sc.nextLine();
    }
    void display() {
        System.out.println("\nName   : "+name );
        System.out.println("Age    : "+age );
        System.out.println("GENDER  : "+gender );
        }
}