class Base
{
Base() {
System.out.println("Base COns");
}
Base(int a) {
System.out.println("Base with value " + a);
}
}
class Derived extends Base{
Derived() {
super(0);
System.out.println("Derived cons");
}
Derived(int a, int b)
{
super(a);
System.out.println("Derived with " + b);
}
}
public class OOP{
public static void main(String[] args){
Derived b=new Derived();
}
}