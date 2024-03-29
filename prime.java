// DC2022BCA0004 Aditya Deb Chowdhury
import java.util.Scanner;
class prime{
    int start;// Starting range
        int end;   // Ending range
int userinput(){
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting number of the range:");
            start=sc.nextInt();
System.out.println("Enter the ending number of the range:");
           end=sc.nextInt();
return 0;
}
int isPrime(int n) {
    int prime=1;
    if (n <= 1) {
       prime=0;
    }
    else{
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            prime=0;
        }
    }
   
}
return prime;
}
void displayprime(){
    System.out.println("Prime numbers between " + start + " and " + end + " are: ");
    for (int num = start; num <= end; num++) {
        if (isPrime(num)==1) {
            System.out.println(num + " ");
        }
    }
}

    public static void main(String[] args) {
       
        prime a=new prime();//object creation
        a.userinput();//calling the constructor
        
        a.displayprime();

    
    
}
}
