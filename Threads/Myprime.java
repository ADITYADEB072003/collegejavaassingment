//DC2022BCA0004
import java.util.*;
class Myprimeint extends Thread {
int s;
int e;
Myprimeint(String a,int i,int y){
s=i;
e=y;
this.setName(a);

}
// checking the no whether prime or not
int isprime(int n){
	int prime=1;
if (n<=1){

	prime=0;
	
}
else{

for(int i=2;i*i<=n;i++){
	if(n%i==0){
	prime=0;
	
	}

	}


		}

return prime;
		}

// pushing the no
void displayprime(){

System.out.println("PRIME NUMBER ARE:-"+this.getName());
for(int num=s;num<=e;num++){
	if(isprime(num)==1){
		System.out.println(num+"");	
	
	}

}
}
// calling the method
public void run(){

displayprime();

}

}

class Myprime{
public static void main(String args[]){

Myprimeint t1 =  new Myprimeint("t1",1,100);
Myprimeint t2 =  new Myprimeint("t2",100,200);
Myprimeint t3 =  new Myprimeint("t3",1,1000);
t1.start();

t2.start();
t3.start();
}
}


