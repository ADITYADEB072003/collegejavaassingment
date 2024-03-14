class StaticBlockDemo {
    int x = 10;

    // Static block
    static {
        System.out.println("In static block");
    }
    static {
        System.out.println("In static block1");
    }
    // Instance Initialization block
    {
        System.out.println("In Instance Initialization block");
        System.out.println("Printing Instance variable Initializer value through Block: " + x);
    }

    // Constructor 1
    StaticBlockDemo(int y) {
        x = y;
        System.out.println("Within Constructor");
        System.out.println("Instance variable initialized using constructor: " + x);
    }

    // Constructor 2
    StaticBlockDemo() {
        System.out.println("Within Constructor");
        System.out.println("Instance variable printed using constructor: " + x);
    }

    public static void main(String[] args) {
        System.out.println("In main");
        StaticBlockDemo st = new StaticBlockDemo(100);
        System.out.println("------------------------------------------ ");
        StaticBlockDemo st1 = new StaticBlockDemo();
    }
}
