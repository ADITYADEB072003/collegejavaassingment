
 class in extends Exception{
in(String message)
{
    super(message);
}
String tostring(){
    return getMessage();
}

 }
public class invalid {
    public static void main(String[] args) {
        try{
            int a=-1;
            if(a<0){
                throw new in("invalid");
            }
        }catch(in e){
            System.out.println(e.toString());
        }
    }
}
