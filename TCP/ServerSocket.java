import java.net.*;
import java.io.*;
public class ServerSocket{
    public static void main(String[] args){

        //Server Socket
        System.out.println("S: Server is started");
        ServerSocket ss=new ServerSocket(9999);

        System.out.println("S : Server is waiting for client request");
        Socket s=ss.accept();

        System.out.println("Client connected");

        //Reading msg which is send by client to the server
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msgfromClient=br.readLine();

        String msgFromServer=msgfromClient.substring(0,3);
        
        
        //Area of sending msg from the server to the client
        
         OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(os,true);
        out.println(msgFromServer);
        out.flush();
        s.close(); // Client Socket close
        ss.close(); //Server Socket close

    }
} 