import java.util.*;
class method extends Thread{

int count =0;
public    void increaement(){
    
    for(int i=0 ;i<=5;i++){
        count++;
    System.out.println(count);
    }
    
}
public    void increaement1(){
    
    for(int i=0 ;i<=500;i++){
      
    System.out.println(i);
    }
    
}


public void run(){
    synchronized(this){
    increaement();
    increaement1();
}
}
}





public class syncblock {
    public static void  main (String args[]){
        method a= new method();
        a.start();
        method a1= new method();
        a1.start();
    
}
}