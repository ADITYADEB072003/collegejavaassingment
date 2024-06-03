import java.util.Arrays;

class FamilyAges {
    public static void main(String[] args) {
        int[] ages = {35, 28, 42, 12, 8, 65}; // Example ages
        Arrays.sort(ages);
        System.out.println("Youngest member age: " + ages[0]);
        System.out.println("Eldest member age: " + ages[ages.length - 1]);
    }
}
