import java.io.*;
public class writeReadFromFile{
    public static void main(String[] args) throws Exception{

        //Write into a file named input.txt
        BufferedWriter bw=new BufferedWriter(new FileWriter("input.txt"));
        
        bw.write("Hey i am Bishwas");
        bw.write("\nI am from Pokhara");

        //CLosing the file
        bw.close();


        //Read from the file named input.txt
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String read;

        while((read=br.readLine())!=null)
        {
            System.out.println(read);
        }

        //Closing the file
        br.close();
    }
}