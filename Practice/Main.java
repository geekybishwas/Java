import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello World");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    float f=sc.nextFloat();
    System.out.println("FLoat is "+ f);
    System.out.println("Input integer is " + a);
    System.out.println("Sum is "+ sum);
    boolean b1=sc.hasNextInt(); // Returns ture if input is integer than false
    System.out.println(b1);
    String str=sc.next(); //Only accept first word
    // String str1=sc.nextLine(); // Accept whole string
    System.out.println(str);
    System.err.println("hey");
  } 
}












































































 