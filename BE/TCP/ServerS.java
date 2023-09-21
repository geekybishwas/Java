import java.net.*;
import java.io.*;
public class ServerS{
    public static void main(String[] args){
        System.out.println("Server started");
        
        //Server Scoket
        ServerSocket ss=new ServerSocket(9999);

        //Server is waiting for the client
        Socket s=ss.accept();

        System.out.println("Client Connected");

        String msgfromtheClient;

        //Receiving client msg and stored in a variable msgfromClient
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        msgfromtheClient=br.readLine();

        System.out.println("Message from the client is " + msgfromtheClient);

        //Area of sending msg to the client
        String msgbyServer="Received Succesfully";
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(os,true);
        out.println(msgbyServer);
        out.flush(); 
    }
}