class fibo implements Runnable{
    int n;
    fibo(int n){
        this.n=n;
    }
    public void run(){
        System.out.println("fibonacci series of "+n+" is ");
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
            }
}
}

public class fibothread {
 public static void main(String[] args) {
    fibo f1=new fibo(10);
    fibo f2=new fibo(20);
    Thread t1=new Thread(f1);
    Thread t2=new Thread(f2);
    t1.start();
    t2.start();
    
 }   
}
