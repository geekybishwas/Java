// import java.io.*;
// public class file_reader_writer{
//     public static void main(String[] args) throws IOException{
//         BufferedReader in=new BufferedReader(new FileReader("input.txt"));
//         BufferedWriter out=new BufferedWriter(new FileWriter("output.txt"));
//         int c;
//         while((c=in.read())!=-1)
//         {
//         out.write(c);
//         }
//         in.close();
//         out.close();
//     }
// }
import java.io.*;
public class file_reader_writer{
    public static void main(String[] args) throws IOException{
        //BufferedWriter
        BufferedWriter bw=new BufferedWriter(new FileWriter("input.txt"));
        for(int i=0;i<3;i++)
        {
        bw.write("Bishwash\n");
        }
        bw.close();

        //BufferedReader
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String name;
        while((name=br.readLine())!=null)
        {
        System.out.println(name);
        }
        br.close();
    }
}
