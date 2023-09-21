interface Bicycle
{
int a=54;
// Interface methods are default by public and properties are default by final 
void speedUp();
void pressBrake();
}
class Ktm implements Bicycle
{
public void speedUp()
{
System.out.println("Speeding");
}
public void pressBrake()
{
System.out.println("Brakeee");
}
}
public class Interfaces{
public static void main(String[] args){
Ktm k=new Ktm();
k.speedUp();
k.pressBrake();

// You can create properties in interface
System.out.println(k.a);

//You can't modify the properties of Interface bcz they are final by default
// k.a=45 -->error

}
}