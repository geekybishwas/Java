
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
class Cat{
    final String name;
    int age;

    public Cat(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {   
        return name;
    }
    private void meow()
    {
        System.out.println("Meow");
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
public class ReflectionExample{
    
    public static void main(String[] args) throws Exception{
        Cat c=new Cat("Stella",9);
        Field[] f=c.getClass().getDeclaredFields(); //Get fields of class Cat with its object by the help of reflcetion
        for(Field f1:f)
        {
            // System.out.println(f1.getName());
            if(f1.getName().equals("name"))
            {   
                //For setting the name that is declared as final by the help of reflection
                f1.setAccessible(true);
                f1.set(c,"Jerman");
            }
        }
        Method[] m=c.getClass().getDeclaredMethods();
        for(Method m1:m)
        {
            // System.out.println(m1.getName());
            if(m1.getName().equals("meow"))
            {
                m1.setAccessible(true); //accessible to true
                m1.invoke(c); //call the public meow method
            }
        }
        System.out.println(c.getName());
    }
}