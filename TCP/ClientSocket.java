import java.net.*;
import java.io.*;
public class ClientSocket{
    public static void main(String[] args){
        
        //Client socket
        Socket clientSocket=new Socket("localhost",9999);

        //Client msg to be sent to the server
        String clientMsg='Bishwash';

        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(os,true);
        out.println(clientMsg);
        out.flush();
        
        //Area of receiving message from the server

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msgFromServer=br.readLine();

        System.out.println("Message from the server is "+msgFromServer);

        clientSocket.close();
    }
}