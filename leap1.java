import java.util.*;
class leap1{
int leapyear(int year) {
    int leapYearCase = year % 4 == 0 ? 0 : 1;
    switch(leapYearCase) {
      //if the year is divisible by 4 or (divisible by 100 and not divisible by 400) then it'
    case 0:
    if((year%4==0)||(year%100==0&& year%400==0)){
        System.out.println("Leap Year");
    }
    else{
        System.out.println("Leap Year Not");
    }
    break;
   
default:

System.out.println("invalid leap year");
    break;
    }

return 0;
}
public static void main(String[] args)
{System.out.print("Enter the year");
    Scanner a=new Scanner(System.in);
    int b=a.nextInt();
 leap1 u = new leap1();
 u.leapyear(b);
}

}