
import java.io.*;
public class student implements java.io.Serializable{
    public String name;
    public String address;
    public int number;
    public int age;
    public void result()
    {
        System.out.println("Result of "+name +" ");
    }
    public student(){}
}