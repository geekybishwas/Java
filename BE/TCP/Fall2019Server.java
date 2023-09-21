import java.net.*;
public class Fall2019Server{
    public static void main(String[] args){

        
        //Server Socket
        System.out.println(" S:Server Started ");

        ServerSocket ss=new ServerSocket(9999); //port number is given in the ServerSocket

        //Waiting to get Conneted
        Socket s=ss.accept();

        System.out.println("Client Connected Succesfully");

        //Receiving client number and squre it 
        int a;
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        a=Integer.parseInt(br.realLine());

        System.out.println("Number from the client is " + a);

        //Area of sending squre of number to the client;
        int b=a*a;
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(os,true);
        pw.println(b);
        pw.flush();

        System.out.println("Square of number succesfully sent to the client i.e a= "+ a +"and b= "+ b);

    }
}