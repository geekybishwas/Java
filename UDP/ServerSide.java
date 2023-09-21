import java.net.*;
import java.io.*;
public class ServerSide{
    public static void main(String[] args) throws Exception{
    
    //Server socket
    DatagramSocket ds=new DatagramSocket(9999);

    byte[] b=new byte[1024];

    DatagramPacket dp=new DatagramPacket(b,b.length);
    
    //Message receive from the client
    ds.receive(dp);

    System.out.println("Message received by the server, Client Successfully Connected");
    
    String str=new String(dp.getData()).trim();

    String st1="Msg from the server, Good Boy";

    byte[] b1=st1.getBytes();

    InetAddress clientAddress=InetAddress.getLocalHost();

    int clientPort=dp.getPort();
    DatagramPacket dp1=new DatagramPacket(b1,b1.length,clientAddress,clientPort);

    ds.send(dp1);
 
    ds.close();
    }
}