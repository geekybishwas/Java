import java.net.*;
import java.io.*;
public class ClientSide{
    public static void main(String[] args) throws Exception{
        
        //Make DatagramSocket
        DatagramSocket ds=new DatagramSocket();
        
        // BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a msg to send to the server");
        
        //Get msg from user by input
        String msgfromClient="Hey server";

        //Converted into Byte
        byte[] b=msgfromClient.getBytes();

        //Get ipaddress of client
        InetAddress clientAddress=InetAddress.getLocalHost();

        //Make packet to be send to the server
        DatagramPacket dp=new DatagramPacket(b,b.length,clientAddress,9999);

        //Send data packet to the server
        ds.send(dp);

        //Data to be received from the server
        byte b1=new byte[1024];
        
        DatagramPacket dp1=new DatagramPacket(b1,b1.length);

        ds.receive(dp1);

        //Receive data from the server
        String msgfromServer=new String(dp1.getData()).trim();

        System.out.println("Data received from the server is " + msgfromServer);

        ds.close();
    }
}