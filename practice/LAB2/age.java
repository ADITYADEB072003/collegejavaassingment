

public class age {
    public static void main(String[] args) {
    int [] a={35, 28, 42, 12, 8, 65};
    int b=a.length;
    //for(int i=0;i < b - 1;i++){
      //  for(int j=0;j<b-1-i;j++){
        //    if(a[j]>a[j+1]){
          //      int temp=a[j];
           //     a[j]=a[j+1];
            //    a[j+1]=temp;
       // }
   // }
   // }
int largest=a[0];
int smallest=a[0];
//
for(int i=1;i<b;i++){
    if(a[i]<largest){
        largest=a[i];
    }
    if(a[i]>smallest){
        smallest=a[i];
        }
        }

    for(int i=0;i<b;i++){
        System.out.println(a[i]);
        }
        System.out.println("YOUNGEST:-"+largest);
        System.out.println("ELDEST:-"+smallest);
}
}