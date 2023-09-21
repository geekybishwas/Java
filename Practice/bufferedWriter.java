import java.io.* ;
public class bufferedWriter{
    public static void main(String[] args){
        try{
        BufferedWriter wri=new BufferedWriter(new FileWriter("output.txt"));
        wri.write("Writing text");
        wri.close();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }
}