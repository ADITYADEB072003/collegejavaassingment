package END_LAB.array;

public class flat {
    public int[][] a;
   int row;
   int col;
   public void initialise_a() {
       int r,c;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       r = scanner.nextInt();
       System.out.print("Enter number of columns: ");
       c = scanner.nextInt();
       a = new int[r][c];
       row=r;
       col=c;
       System.out.println("Enter elements of the array:");
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               a[i][j] = scanner.nextInt();
           }
     
   }
}

   public void flatarray(){
       int [] flat=new int [row*col];
       int index=0;
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               flat[index++]=a[i][j];
           }
       }
       bubble(flat);

   }
   public void bubble(int [] matrix){
       boolean swap;
      int n=matrix.length;
      int temp;
      for(int i=0;i<n-1;i++){
       swap=true;
       for(int j=0;j<n-i-1;j++){
           if(matrix[j]>matrix[j+1]){
               temp=matrix[j];
               matrix[j]=matrix[j+1];
               matrix[j+1]=temp;
               swap=true;
           }
       }
       if(swap!=true)break;
      }
      convert(matrix);
   }
   public void convert(int []a1){
       int index = 0;
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               a[i][j] = a1[index++];
           }
       }
   }
   
   public void display_a() {
       System.out.println("Array elements:");
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
   }
   
}

