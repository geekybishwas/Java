import java.io.*;
public class DeserializeDemo{
public static void main(String[] args){
    try{
        FileInputStream fil=new FileInputStream("os.txt");
        ObjectInputStream in=new ObjectInputStream(fil);
        try{
        student e=(student) in.readObject(); //Deserialization
        }
        catch(Exception e)
        {
        e.printStackTrace(); 
        }
        // in.close();
        // fil.close();
        System.out.println("Deserialized");
        System.out.println(e.number);
        System.out.println(e.age);
        System.out.println(e.address);
    }
    catch(IOException e){
    e.printStackTrace();
    }
}
}