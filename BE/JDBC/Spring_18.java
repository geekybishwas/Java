import java.io.*;
import java.util.*;
import java.mysql.*;
public class Spring_18{
    public static void main(String[] args){
    try{
        //Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create a connection
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

        //Create a query
        String g="Update table set salary=? where post=?";

        PreparedStatement pstmt=conn.prepareStatement(q);

        pstmt.setInt(1,50000);
        pstmt.setString(2,"Manager");

        pstmt.executeUpdate();

        System.out.println("Salary updated to 50000 whose post is Manager");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}