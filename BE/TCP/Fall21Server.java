import java.net.*;
import java.io.*;
public class Fall21Server{
    public static void main(String[] args) throws Exception{

        ServerSocket ss=new ServerSocket(9999);

        Socket s=ss.accept();

        System.out.println("Client Connected");

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String getFromClient=br.readLine();

        String msgbyServer=isPalindrome(getFromClient);

        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(os,true);
        pw.println(msgbyServer);
        pw.flush();

        System.out.println("Msg successfully send");
    }

    public static String isPalindrome(String str)
    {
        str=str.toLowerCase();
        int l=0;
        int r=str.length()-1;

        while(r>l)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return "Not Palidrome";
            }
            l++;
            r--;
        }
        return "Palindrome";
    }
}