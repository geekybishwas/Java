import java.lang.reflect.*;
class Base
{
private int age=19;
private int rollno=2;
public void greet(int a, int b)
{
System.out.println("Hello");
}
public void say(int a,int b)
{
System.out.println("Hellp from Base");
}
}
public class reflectionJava{
public static void main(String[] args){
Base b=new Base();
Field[] fields=b.getClass().getDeclaredFields();
Method methods[]=b.getClass().getDeclaredMethods();
for(int i=0;i<fields.length;i++)
{
System.out.println(fields[i].getName());
}
for(int i=0;i<methods.length;i++)
{
System.out.println(methods[i].toString());
}
}
// Parameter[] parameters=b.getClass.getParamters();
// for(int i=0;i<parameters.length;i++)
// {
// System.out.println("Parameters" + parameters);
// }
}