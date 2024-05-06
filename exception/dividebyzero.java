//DC2022BCA0004
import java.util.*;
class dividebyzero1 extends Exception
{
dividebyzero1(String message){
		super(message);

}
String tostring(){
		return getMessage();
}

}


class dividebyzero{
int a;
int b;
int c;
 public int input(){
 try{
Scanner k=new Scanner(System.in);
System.out.println("Enter the first no");
		a=k.nextInt();
System.out.println("Enter the Second no");
		b=k.nextInt();
if(b==0){
throw new dividebyzero1("Cannot Divide by Zero!");
}



}catch(dividebyzero1 e){
System.out.println(e.tostring());

}

return 0;
}
	public int divide(){
	
		c=a/b;
	return 0;
	}
	
	public int display(){
	divide();
	 System.out.println("AFTER DIVIDING THE ANS:-"+c);
	return 0;
	}
	
	public static void main(String args[]){
	
	dividebyzero l= new dividebyzero();
	l.input();
	l.display();
	
	
	}

}
