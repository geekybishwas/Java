import java.util.Scanner;
public class defaultException{
public static void main(String[] args){
    int a,b,result;
    Scanner input=new Scanner(System.in);
    System.out.println("Input two integers");
    a=input.nextInt();
    b=input.nextInt();
    // Handling with try-catch
    try{
        result=a/b;
        System.out.println("Result" +result);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Exception caught " + e);
    }
    finally{
        System.out.println("Finally Done");
    }
}
}