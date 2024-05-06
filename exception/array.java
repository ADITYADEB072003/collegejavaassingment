//DC2022BCA0004
import java.util.*;
class array{
public static void main(String args []){
int [] numbers={1,2,3,4};
Scanner a=new Scanner(System.in);
try {
	System.out.println("Enter the index to retrieve the data");
	int index=a.nextInt();
	int number=numbers[index];
	System.out.println("Number at index"+index+"is"+number);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Index OUT OF BOUND");

}
catch(Exception e){
	System.out.println("Invalid Input");

}

}
}
