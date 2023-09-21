import java.io.*;
public class bufferReader{
public static void main(String[] args){
        System.out.println("Input an integer");
        int num=0;
        String rawData=null;
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            rawData=br.readLine();// readLine will give string
            num=Integer.parseInt(rawData);//Integer.parseInt will convert it into Integer
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Not a valid number " +ex );
        }
        catch(IOException e)
        {
            System.out.println("Une" +e);
        }
        System.out.println(num);
    }
}