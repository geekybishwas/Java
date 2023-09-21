import java.io.*;
class Student implements Serializable
{
    public String name;
    public String address;
    public int number;
    public void Result()
    {
        System.out.println("Result of "+name+ " ");
    }
}
public class SerializeDemo{
    public static void main(String[] args) throws Exception{
        Student e=new Student();
        e.name="Bishwas";
        e.address="Pokhara";
        e.number=12;

        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("input.txt"));
        out.writeObject(e); //object of class as a paramter
        out.close();

        System.out.println("Serialized data is saved in input.txt");
    }
}