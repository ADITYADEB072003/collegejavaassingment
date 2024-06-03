

public class main2 {
    public static void main(String[] args) {
    int [] a={1,2,3,4,5};
    try{
        System.out.println(a[2]);
        try{
            int a1 =10/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e);

        }
    }catch(ArrayIndexOutOfBoundsException  e){
        System.out.println("ArrayIndexOutOFBoundException"+e);
    }
    
}
}