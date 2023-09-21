import java.io.*;
import java.net.*;
public class ServerS{
    public static void main(String[] args) throws Exception{
        
        DatagramSocket ds=new DatagramSocket(9999);

        byte []b=new byte[1024];

        DatagramPacket dp=new DatagramPacket(b,b.length);

        ds.receive(dp);

        String msgFromClient=new String(dp.getData()).trim();

        //Area of sending msg from the server
        String msgFromServer="Hey client you are connected";

        byte [] b1=msgFromServer.getBytes();
        
        InetAddress ia=InetAddress.getLocalHost();

        DatagramPacket dp1=new DatagramPacket(b1.b1.length,ia,9999);

        ds.send(dp1);

    }
}