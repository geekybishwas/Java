// class MyException extends Exception
// {
//     public String toString() //default
//     {
//         return  "I am toString()";
//     }
//     public String getMessage()
//     {
//         return  "I am getMessage()";
//     }
// }

// public class OwnException{
//     public static void main(String[] args){
//         int a;
//         Scanner sc=new Scanner(System.in);
//         a=sc.nextInt();
//         if(a<9)
//         {
//             try{
//                 throw new MyException();
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e.getMessage());
//                 System.out.println(e);
//             }
//         }
//     }
// }
// class CustomException extends Exception {
//     public CustomException(String message) {
//         super(message);
//     }
// }
// public class OwnException {
//     public static void main(String[] args) {
//         try {
//             int age = -5;
//             if (age < 0) {
//                 throw new CustomException("Age cannot be negative");
//             }
//             System.out.println("Age: " + age);
//         } catch (CustomException e) {
//             System.err.println("Custom Exception Caught: " + e.getMessage());
//         }
//     }
// }
class CustomException extends Exception
{
    public CustomException(String msg)
    {
        super(msg);
    }
};
public class OwnException
{   
    public static void main(String[] args)
    {
        int a=-1;
        try
        {
            if(a<0)
            {
                throw new CustomException("A can't be negative");
            }
        }
        catch(CustomException e)
        {
            System.out.println("Custom " + e.getMessage());
        }
    }
}