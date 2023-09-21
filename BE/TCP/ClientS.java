import java.net.*;
import java.io.*; 
public class ClientS{
    public static void main(String[] args) throws Exception{
        
        String ip="localhost";
        int port=9999;

        //Client socket
        Socket s=new Socket(ip,port);
        String msgtobeSent="Hey Server";

        //Sending msg to the server
        OutputStreamWriter ow=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(ow,true);
        out.println(msgtobeSent);
        out.flush();


        //Area of receiving msg from the server
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msgfromTheServer=br.readLine();

        System.out.println("Msg from the server is " + msgfromTheServer);
    }
}