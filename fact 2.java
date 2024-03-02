// Dc2022bca0004 Aditya deb chowdhury
// factorial
import java.util.*;
class fact{
int fact1(int a){
int fac=1;

for(int i=1;i<=a;i++){

fac*=i;


}
System.out.println("Fact of ="+a+"="+fac);
return 0;
}
public static void main(String args[]){
Scanner a=new Scanner(System.in);
	System.out.println("Enter the no");
	int l=a.nextInt();
	fact k=new fact();
	k.fact1(l);


}

}
