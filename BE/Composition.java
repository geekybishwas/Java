class A{
    public void run()
    {
        System.out.println("Running from A");
    }
}
class B{
    A a;
    B()
    {
        a=new A();
        a.run();
    }
    public void run1()
    {
        System.out.println("B");
    }
    public void run2()
    {
        System.out.println("B1");
    }
}
public class Composition{
    public static void main(String[] args){
        B b=new B();
        A a=new A();
        // a.run1();
    }
}