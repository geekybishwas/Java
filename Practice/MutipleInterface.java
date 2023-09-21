interface Wifi{
void connectToNetwork();
}

interface Camera{
void capturePhoto();
// Private Method of Interface can't be called by the object of class that implements it , but default method of interface can use it
private void captureSelfi()
{
System.out.println("Capturing Selfiii");
}
default void captureVideo()
{
captureSelfi();
System.out.println("Capturing Video");
}
}

class CellPhone{
void pickUp()
{
System.out.println("Picking up call");
}
}

class SmartPhone extends CellPhone implements Wifi,Camera
{
public void capturePhoto()
{
System.out.println("Capturing Photo");
}
public void connectToNetwork()
{
System.out.println("Connecting to Network");
}
public void call()
{
System.out.println("Calling");
}
}

public class MutipleInterface{
public static void main(String[] args){
// SmartPhone sp=new SmartPhone();
// sp.capturePhoto();
// sp.pickUp();
// sp.captureVideo()
// sp.captureSelfi(); -->error

Camera c=new SmartPhone(); // This is a SmartPhone and it uses as a camera
c.capturePhoto();
// c.connectToNetwork(); //-->error : Cannot call methods of Wifi bcz the object which is created is a reference of Camera

// c.call(); //Doesn't allow to run smartphone method
}
}