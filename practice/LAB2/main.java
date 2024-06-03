
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
}
String m(){
    return getMessage();
}
}

public class main {
    public static void main(String[] args) {
        
    
    int age=10;
    try{
if(age<18){
    throw new InvalidAgeException("NOT LEGAL");
}
else{
    System.out.println("LEGAL");
}
    }catch(InvalidAgeException e)
    {
        System.out.println(e.m());
    }


}
}
