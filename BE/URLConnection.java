import java.io.*; //Read Content of file
import java.net.*; //For Connection
public class URLConnection{
    public static void main(String[] args) throws Exception{
        URL u=new URL("https://www.google.com");
        // URLConnection urlC=u.openConnection();
        HttpURLConnection c=(HttpURLConnection) u.openConnection();
        BufferedReader br=new BufferedReader(new InputStreamReader(c.getInputStream()));
        String urlString=" ";
        String current;
        while((current=br.readLine())!=null)
        {
            urlString+=current;
        }
        System.out.println(urlString);
    }
}