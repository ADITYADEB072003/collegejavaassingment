// DC2022BCA0004 Aditya deb chowdhury
// day of week
import java.util.*;
class dayofweek{

public static  void main(String args[]){
		Scanner no=new Scanner(System.in);
		System.out.println("Enter the dayofweek");
		int a=no.nextInt();
		String dayname;
switch(a){
					case 1:
					dayname="MONDAY";
					break;

					case 2:
					dayname="Tueday";
					break;

					case 3:
					dayname="Wednesday";
					break;

					case 4:
					dayname="Thursday";
					break;
					
					case 5:
					dayname="Friday";
					break;

					case 6:
					dayname="Saturday";
					break;

					case 7:
					dayname="Sunday";
					break;

					default:
					dayname="Invalid";
					break;
	


}
System.out.println("DayName="+dayname);


}}
