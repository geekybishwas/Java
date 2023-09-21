import java.net.*;
import java.io.*;  
public class ClientS{
    public static void main(String[] args){
        
        DatagramSocket ds=new DatagramSocket();
        String msgfromClient="heY sERVER";

        //Convert client msg into bytes
        byte [] b=msgfromClient.getBytes();
        
        //Getting ip address of server
        InetAddress sa=InetAddress.getByName("localhost");
        
        //Connecting (byte,byteLength,serverIP,portNumber)
        DatagramPacket dp=new DatagramPacket(b,b.length,sa,9999);

        //Send to the server
        ds.send(dp);


        //Area of receiving msg from the server
        byte [] b1=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(b1,b1.length);
        ds.receive(dp1);

        String msgfromServer=new String(dp1.getData()).trim();
    }
}