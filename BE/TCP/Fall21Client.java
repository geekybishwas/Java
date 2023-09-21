import java.net.*;
import java.io.*;
public class Fall21Client{
    public static void main(String[] args) throws Exception{

        Socket s=new Socket("localhost",9999);

        //Read string from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String getString=br.readLine();

        System.out.println("Inputedd string is " + getString);

        OutputStreamWriter ow=new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(ow,true);
        pw.println(getString);
        pw.flush();

        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msgFromServer=br1.readLine();

        System.out.println("Inputted string is " + msgFromServer);
    }
}