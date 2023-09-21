// import java.io.*;
// public class extra{
//     public static void main(String[] args) throws Exception{

//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String getFromClient=br.readLine();

//         String msgbyServer=isPalindrome(getFromClient);
//         // System.out.println(msgbyServer[0]);
//         System.out.println(msgbyServer);
//     }
//     public static String isPalindrome(String str)
//     {
//         str=str.toLowerCase();
//         int l=0;
//         int r=str.length()-1;

//         while(r>l)
//         {
//             if(str.charAt(l)!=str.charAt(r))
//             {
//                 return "Not Palidrome";
//             }
//             l++;
//             r--;
//         }
//         return "Palindrome";
//     }

// }
// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
	abstract void fun();
}

// Class 2
class Derived extends Base {
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// Main class
public class extra {

	// Main driver method
	public static void main(String args[])
	{

		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		Derived b = new Derived();
		b.fun();
	}
}