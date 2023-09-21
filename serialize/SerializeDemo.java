import java.io.*;
public class SerializeDemo{
public static void main(String[] args){
    try
    {
        student e=new student();
        e.name="Rm";
        e.age=23;
        e.number=21;
        e.address="sadf";

        //Write data to file
        FileOutputStream fos=new FileOutputStream("os.txt");

        //Convert object into byte
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        //How to serialize   
        oos.writeObject(e);
        oos.close();
        fos.close();
        System.out.println("Completely sERIALIZED");
    }
    catch(IOException exception)
    {
        exception.printStackTrace();
    }
}
}