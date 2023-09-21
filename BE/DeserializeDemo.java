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
public class DeserializeDemo{
    public static void main(String[] args) throws Exception{
        Student e=null;
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("input.txt"));
        e=(Student) in.readObject();
        in.close();

        System.out.println("Deserialized ");
        System.out.println("Name :" + e.name);

    }
}
