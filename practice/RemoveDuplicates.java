import java.util.Arrays;
import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        //CHECKING ARRAY[0]!=ARRAY[1]
        int[] uniqueArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArray[j++] = array[i];
            }
        }
        //LAST ELEMENT INSERTED
        uniqueArray[j++] = array[array.length - 1];

        System.out.println("Array without duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
