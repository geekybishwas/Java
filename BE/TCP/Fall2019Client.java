import java.io.net.*;
public class Fall2019Client{
    public static void main(String[] args) throws Exception{
        
        //Ip and port of the server
        String ip="localhost";
        int port=9999;

        //Client Socket
        Scoket s=new Socket(ip,port);

        //Number to be sent.
        int num=9;

        //Sending number to the server
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(os,true);
        out.println(num);
        out.flush();

        //Area of receiving squre number from servver
        int b;
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        int b=Integer.parseInt(br.readLine());

        System.out.println("Sqare of number send by the server is " + b);



    }   
}