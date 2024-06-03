import java.util.Scanner;
public class palin {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("ENTER THE NO");
        int n=a.nextInt();
        int r=0;
        int t=n;
        while(t!=0){
            int d=t%10;
            r=r*10+d;
            t=t/10;
        }
System.out.println("REVERSE"+r);
// Checking 
if(n==r){
    System.out.println("PALINDROME");
    }
    else{
        System.out.println("NOT A PALINDROME");
        }
}
}
