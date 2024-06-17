

public class string {
    public static void main(String[] args) {
        String str="HEllo";
        System.out.println(str.indexOf('l'));
        System.out.println(str.charAt(4));
        System.out.println(str.substring(1, 2));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toString());
        System.out.println(str.replace("l", "L"));
    StringBuilder sb3 = new StringBuilder();
        sb3.append("Hello")
           .append(" ")
           .append("World")
           .insert(5, ",")
           .replace(6, 11, "Java")
           .capacity();
        System.out.println("Chained methods result: " + sb3);
    }
}
