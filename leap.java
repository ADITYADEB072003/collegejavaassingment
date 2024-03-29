import java.util.*;
class leap{
int leapyear(int year) {
      //if the year is divisible by 4 or (divisible by 100 and not divisible by 400) then it'
      if((year%4==0)||(year%100==0 && year%400==0))
      {
        System.out.println("Leap Year");
    }
else{
    System.out.println("Leap Year Not");

}
return 0;
}
public static void main(String[] args)
{
    System.out.print("Enter the year");
    Scanner a=new Scanner(System.in);
    int b=a.nextInt();
    leap u = new leap();
    u.leapyear(b);

}

}