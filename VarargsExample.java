//DC2022BCA0004
//VARIABLE LENGTH
public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20, 30);
    }
    
    public static void printNumbers(int... numbers[]) {
        System.out.println("Printing numbers:");
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
