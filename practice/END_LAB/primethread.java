

class prime extends Thread{

int s;
int e;
    prime(String a,int s, int e){
this.s=s;
this.e=e;
this.setName(a);
}
int prime(int n){
    int prime =1;
    if(n<=1){
        prime=0;
    }
    else{
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                prime=0;
    }


    }
    
}
return prime;
}
void displayprime(){
System.out.println("Prime NO"+this.getName());
    for(int i=s;i<=e;i++){
        if(prime(i)==1){
            System.out.println(i);
            }
}
}
public void run(){
   synchronized(this){ displayprime();
   }
}
}

class primethread {
    public static void main(String[] args) {
        prime p1=new prime("thread1",2,10);
        prime p2=new prime("thread2",11,20);
        prime p3=new prime("thread3",21,30);
        p1.start();
        p2.start();
        p3.start();
    }
}
