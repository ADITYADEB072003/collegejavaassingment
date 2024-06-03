class div extends Exception{
    div(String message){
        super(message);
    }
     String tostring(){
      return getMessage();
    }
}

public class dividebyzero {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{if(b==0){
            throw new div("DIVIDE BY ZERO");    
                }
            int c=a/b;
            System.out.println(c);
            
        }catch(div e){
            System.out.println(e.tostring());
        }
    }
}
