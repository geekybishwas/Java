abstract class Base{
public Base()
{
System.out.println("Constructor of Base Class");
}
public void greet()
{
System.out.println("Morning");
}
abstract public void say();
abstract public void say1();
}
class Derived extends Base{
public Derived()
{
System.out.println("Constructor of Derived Class");
}
public void say()
{
System.out.println("Saying hello from abstract method");
}
public void say1()
{
System.out.println("Saying hello from another abstract method");
}
}
public class AbstractClass{
public static void main(String[] args){
Derived b=new Derived();
b.say  ();
b.say1();
b.greet();
}
}

