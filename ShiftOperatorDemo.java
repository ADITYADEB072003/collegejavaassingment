class ShiftOperatorDemo {
    public static void main(String args[]) {
        int num = 8; // binary representation: 1000
        
        // Left shift operator (<<)
        int resultLeftShift = num << 2; // Shifts bits to the left by 2 positions
        // Binary representation of resultLeftShift: 100000 (equals 32 in decimal)
        System.out.println("Result of left shift: " + resultLeftShift);
        
        // Right shift operator (>>)
        int resultRightShift = num >> 2; // Shifts bits to the right by 2 positions
        // Binary representation of resultRightShift: 10 (equals 2 in decimal)
        System.out.println("Result of right shift: " + resultRightShift);
        
        // Unsigned right shift operator (>>>)
        int negativeNum = -8; // binary representation: 11111111111111111111111111111000
        int resultUnsignedRightShift = negativeNum >>> 2; // Shifts bits to the right by 2 positions
        // Binary representation of resultUnsignedRightShift: 00111111111111111111111111111110 (equals 1073741822 in d
    }
}
