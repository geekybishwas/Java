import java.io.*;
import java.util.*;
public class ByteStream{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("input .txt");
        byte [] buffer=new byte[1024];
        int byteRead;
        while((byteRead=fis.read(buffer))!=-1)
        {
            String data=new String(buffer,0,byteRead);
            System.out.println(data);
        }
    }
}