import java.util.Scanner;
public class finallyBlock{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int a=9;
    try
    {
    int c=a/b;
    System.out.println(c);
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    finally{
    System.out.println("Always excetued");
    }
    }
}