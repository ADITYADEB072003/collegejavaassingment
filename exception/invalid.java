//DC2022BCA0004
import java.util.*;
class InvalidException extends Exception
{
InvalidException(String message){
		super(message);

}
String tostring(){
		return "exception ="+getMessage();
}

}
class invalid{
public static void main(String args[]){
Scanner u=new Scanner(System.in);

try{

		System.out.println("Enter a number");
		int n=u.nextInt();
if(n<1 || n>100){
 throw new InvalidException("INVALID INPUT");


}
System.out.println("Valid number inputed");

}catch(InvalidException e){
System.out.println(e.tostring());

}






}
}
