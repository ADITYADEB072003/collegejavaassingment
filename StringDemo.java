// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

class StringDemo {
   StringDemo() {
   }

   public void performStringOperations() {
      String var1 = "This is a Demo String";
      String var2 = "This is a Demo String 2";
      byte var3 = 20;
      System.out.println("Length of String = " + var1.length());
      PrintStream var10000 = System.out;
      boolean var10001 = var1.equals(var2);
      var10000.println("x and y are equal = " + var10001);
      if (var1.compareTo(var2) < 0) {
         System.out.println("x is less than y");
      } else if (var1.compareTo(var2) > 0) {
         System.out.println("x is greater than y");
      } else {
         System.out.println("x is equal to y");
      }

      var10000 = System.out;
      var10001 = var1.regionMatches(0, var2, 0, 11);
      var10000.println("x region matches with y: " + var10001);
      System.out.println("index of \"i\" in String x is: " + var1.indexOf("i"));
      System.out.println("index of \"is\" in String x is: " + var1.indexOf("is"));
      System.out.println("Last index of \"i\" in String x is: " + var1.lastIndexOf("i"));
      System.out.println("Last index of \"is\" in String x is: " + var1.lastIndexOf("is"));
      System.out.println("Substring of String x from character 4 is: " + var1.substring(4));
      System.out.println("Substring of String x from character 4 to 15 is: " + var1.substring(4, 15));
      System.out.println("character at position 6 is:" + var1.charAt(6));
      System.out.println("UpperCase: " + var1.toUpperCase());
      System.out.println("LowerCase: " + var1.toLowerCase());
      System.out.println("x starts with \"Th\": " + var1.startsWith("Th"));
      System.out.println("x ends with \"ng\": " + var1.endsWith("ng"));
      System.out.println("Converts int to String: " + String.valueOf(var1));
   }
   public static void main(String[] args) {
    StringDemo demo = new StringDemo();
    demo.performStringOperations();
}
}
