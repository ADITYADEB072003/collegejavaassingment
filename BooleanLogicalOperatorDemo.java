class BooleanLogicalOperatorDemo
{
public static void main(String args[])
{
boolean a = true,b = false;
System.out.println("Logical OR: "+ a +" | "+b+": " +(a|b));
System.out.println("Logical XOR: "+ a +" ^ "+b+": "+(a^b));
System.out.println("Logical AND: "+ a +" & "+b+": "+(a&b));
System.out.println("Logical NOT: !a : "+(!a));
System.out.println("Conditional OR: "+ a +" || "+b+": "+(a||b));
System.out.println("Conditional AND: "+ a +" && "+b+": "+(a&&b));
// shortcut operator
a |= b;
System.out.println("Shortcut OR: "+ a +" | "+b+" = "+(a));
}
}