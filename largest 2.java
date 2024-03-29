// DC2022BCA0004 ADITYA DEB CHOWDHURY
// TO find largest no in an array
import java.util.*;

public class largest {

 
    public static void main(String[] args) {
          Scanner n=new Scanner(System.in);
         
             int[] numbers = new int [10];
		System.out.print("Enter the no");
 for (int i = 1; i < numbers.length; i++) {
 	numbers[i]=n	.nextInt();}
        
        int largest = findLargestElement(numbers);

        
        System.out.println("The largest element in the array is: " + largest);
    }

    // Method to find the largest element in the array
    public static int findLargestElement(int[] arr) {
        
        int largest = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
