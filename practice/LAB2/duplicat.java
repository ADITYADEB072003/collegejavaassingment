

public class duplicat {
    public static void main(String[] args) {
        int [] a={266,34,56,56,78,78,99};
        int b=a.length;
        int c=0;
        int [] un=new int [b];
        for(int i=0;i<b-1;i++){
            if(a[i]!=a[i+1]){
                un[c++]=a[i];
            }
            
            }
            un[c++]=a[a.length-1];
            for(int i=0;i<c;i++){
                System.out.println(un[i]);
                }
}
}