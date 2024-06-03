import java.util.*;

class no implements Runnable{
    public void run(){
        try{
        System.out.println("HEllo");
        Thread.sleep(100);
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}

class no2 implements Runnable{
    public void run(){
        try{
        for(int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(100);
        }
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class thread1 {
public static void main (String args[])
{    no a=new no();
    Thread k=new Thread(a);
    
    k.start();
    no2 a1=new no2();
    Thread k2=new Thread(a1);
    k2.start();
   
}
}
