public class MyClass {
    private int x;
    private int y;
    private String name;

    // Constructor with no parameters
    public MyClass() {
        // Call another constructor with default values
        this(0, 0, "Default");
    }

    // Constructor with two parameters
    public MyClass(int x, int y) {
        // Call another constructor with provided x, y, and default name
        this(x, y, "Default");
    }

    // Constructor with all parameters
    public MyClass(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        MyClass obj1 = new MyClass(); // Using default constructor
        MyClass obj2 = new MyClass(10, 20); // Using constructor with two parameters
        MyClass obj3 = new MyClass(5, 8, "Custom"); // Using constructor with all parameters

        // Display object details
        System.out.println("Object 1: x=" + obj1.getX() + ", y=" + obj1.getY() + ", name=" + obj1.getName());
        System.out.println("Object 2: x=" + obj2.getX() + ", y=" + obj2.getY() + ", name=" + obj2.getName());
        System.out.println("Object 3: x=" + obj3.getX() + ", y=" + obj3.getY() + ", name=" + obj3.getName());
    }
}
