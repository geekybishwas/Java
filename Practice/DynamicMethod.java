class A{
    int a=4;
    public void kxa()
    {
        System.out.println("K xa ");
    }
    public void greet()
    {
        System.out.println("Of class A");
    }
}
class B extends A
{
    public void greet()
    {
        System.out.println("Of class B");
    }
    public void lala()
    {
        System.out.println("lala");
    }
}
public class DynamicMethod{
    public static void main(String[] args){
        A a=new A(); // Valid
        A a1=new B(); // Super class ko reference barabar hunxa sub class ko object saga
        // B b=new A(); // Invalid : subclass ko reference barabar hunna super class ko object saga
        a1.greet(); // It runs the method of class B because object of class B is created
        System.out.println(a1.a);
        // a1.lala(); // Is is invalid because obj is created by the refrence of super class , so no method of subclass will run
    }
}

