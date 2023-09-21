import java.util.Scanner;
class MyException extends Exception
{
public String toString(){
    return super.toString() + " I am toString()";
}
public String getMessage()
{
    return " I am getMessage()";
}
}
public class exceptionClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<8)
        try{
            throw new MyException();
            // throw new ArithmeticException("I am low");
        }
        catch(Exception e)
        {   
            System.out.println(e.getMessage()); 
            System.out.println(e.toString()); 
        }
     }
}