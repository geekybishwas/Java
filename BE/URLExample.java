import java.io.*;
import java.net.*;
public class URLExample{
    public static void main(String[] args) throws Exception{
        URL url=new URL("https://www.google.com");

        System.out.println(url.toString());
        System.out.println(url.getProtocol());
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getPort());
    }
}