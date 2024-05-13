class fibo extends Thread{
int n;
fibo(String a,int n){
this.n=n;
this.setName(a);
}
static void Fibonacci(int n)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

void display(){

System.out.println("NUMBER ARE:-"+this.getName());
Fibonacci(n);
	

}
public void run(){
display();
    


}

}
class fiboth{
public static void main(String args[]){
fibo t1=new fibo("t1",10);
t1.start();
fibo t2=new fibo("t2",20);
t2.start();
}
}

