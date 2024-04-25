//DC2022BCA0004
// StringDemo class demonstrating various String operations
class StringDemo {
    public void performStringOperations() {
        // String Declaration
        String x = "This is a Demo String";
        String y = "This is a Demo String 2";
        // int declaration
        int i = 20;

        // finding the length of String
        System.out.println("Length of String = " + x.length());

        // equals method of Object class has been overridden by the String class
        System.out.println("x and y are equal = " + (x.equals(y)));

        // comparison of Strings
        if ((x.compareTo(y)) < 0)
            System.out.println("x is less than y");
        else if ((x.compareTo(y)) > 0)
            System.out.println("x is greater than y");
        else
            System.out.println("x is equal to y");

        // Region Matching within Strings
        System.out.println("x region matches with y: " + (x.regionMatches(0, y, 0, 11)));

        // finding index of Characters
        System.out.println("index of \"i\" in String x is: " + x.indexOf("i"));
        // finding index of particular String
        System.out.println("index of \"is\" in String x is: " + x.indexOf("is"));

        // finding the last occurrence of a particular character
        System.out.println("Last index of \"i\" in String x is: " + x.lastIndexOf("i"));
        // finding the last occurrence of a particular substring
        System.out.println("Last index of \"is\" in String x is: " + x.lastIndexOf("is"));

        // sub string
        System.out.println("Substring of String x from character 4 is: " + x.substring(4));
        System.out.println("Substring of String x from character 4 to 15 is: " + x.substring(4, 15));

        // finding character at particular position
        System.out.println("character at position 6 is:" + x.charAt(6));

        // upper case and lower case
        System.out.println("UpperCase: " + x.toUpperCase());
        System.out.println("LowerCase: " + x.toLowerCase());

        // finding whether strings start and end with a particular string
        System.out.println("x starts with \"Th\": " + x.startsWith("Th"));
        System.out.println("x ends with \"ng\": " + x.endsWith("ng"));

        // Converts int to String
        System.out.println("Converts int to String: " + String.valueOf(i));
    }
}

// StringBufferDemo class demonstrating StringBuffer operations
class StringBufferDemo {
    public void performStringBufferOperations() {
        // Creating a StringBuffer instance
        StringBuffer sb = new StringBuffer();

        // Initial capacity of StringBuffer
        System.out.println("Initial Capacity : " + sb.capacity());

        // Appending a string to StringBuffer
        System.out.println("String appended : " + sb.append("Dogs bark at night"));

        // Replacing a portion of string in StringBuffer
        System.out.println("String replaced: " + sb.replace(10, 12, "during"));

        // Reversing the content of StringBuffer
        System.out.println("String reversed : " + sb.reverse());

        // Current capacity of StringBuffer
        System.out.println("Current Capacity : " + sb.capacity());

        // Accessing character at a specific position in StringBuffer
        System.out.println("character at position 3 is: " + sb.charAt(3));

        // Setting a character at a specific position in StringBuffer
        sb.setCharAt(3, 'a');   
        System.out.println("sb after setting \"a\" at 3: " + sb);
    }
}

// call class to invoke StringDemo and StringBufferDemo
class call {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        System.out.println("Output from StringDemo:");
        stringDemo.performStringOperations();

        StringBufferDemo stringBufferDemo = new StringBufferDemo();
        System.out.println("\nOutput from StringBufferDemo:");
        stringBufferDemo.performStringBufferOperations();
    }
}
