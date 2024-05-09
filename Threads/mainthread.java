class even extends Thread
{

public void run(){
int i;
for(i=0;i<=10;i++){
try{
	System.out.println("THE  are :="+i);
	Thread.sleep(1000);
	}catch(Exception e){
	System.out.println(e);
	}}
}
}

class hello extends Thread
{

public void run(){
int i;

try{
    System.out.println("HELLO WORDL");
	Thread.sleep(1000);
	}catch(Exception e){
	System.out.println(e);

}
}

}
class mainthread{
public static void main(String a[]){

even a1=new even();
a1.start();
hello a2=new hello();
a2.start();

}



}
