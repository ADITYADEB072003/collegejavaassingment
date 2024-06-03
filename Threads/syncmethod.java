import java.util.*;
class method extends Thread{

int count =0;
public  synchronized  void increaement(){
    
    for(int i=0 ;i<=5;i++){
        count++;
    System.out.println(count);
    }
    
}


public void run(){
    increaement();
}
}




public class syncmethod {
    public static void  main (String args[]){
    method a= new method();
    a.start();
    method a1= new method();
    a1.start();

}
}