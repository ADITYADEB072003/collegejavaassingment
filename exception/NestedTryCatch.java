class NestedTryCatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            // Outer try block
            System.out.println(array[2]); // This will throw ArrayIndexOutOfBoundsException
            try {
                // Inner try block
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");
        }
    }
}
