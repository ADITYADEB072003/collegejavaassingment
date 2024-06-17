
class even implements Runnable
{

public void run(){
int i;
for(i=0;i<=10;i++){
try{

	
	
	System.out.println("THE  are :="+i);
	Thread.sleep(1000);
	}catch(Exception e){
	System.out.println(e);
	


}

}


}

}


class hello implements Runnable
{

public void run(){
int i;

try{

	
	
	System.out.println("HELLO WORDL");
	Thread.sleep(1000);
	}
	


catch(Exception e){
	System.out.println(e);

}
}

}




class mainthread2{
public static void main(String a[]){

even a1=new even();
Thread h=new Thread(a1);

h.start();
hello a2=new hello();
Thread h1=new Thread(a2);

h1.start();
}



}
