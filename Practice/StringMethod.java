import java.util.Scanner;
public class StringMethod
{
public static void main(String[] args)
{
String name="Bishwash";
// Scanner sc=new Scanner(system.in);
System.out.println(name.length());
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());

System.out.println(name.trim());
System.out.println(name.substring(1));
System.out.println(name.substring(4,8));
System.out.println(name.replace("h","a"));
System.out.println(name.startsWith("Bish"));
System.out.println(name.endsWith("wash"));
System.out.println(name.charAt(1)); //Returns character of given index
System.out.println(name.indexOf('B')); //Returns index of given character
System.out.println(name.indexOf('s',3)); //Search s from index 3
System.out.println(name.lastIndexOf('w'));
System.out.println(name.equals("Bishwash"));
System.out.println(name.equalsIgnoreCase("BiSHWASh"));
}
}