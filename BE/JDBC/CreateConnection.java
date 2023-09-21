import java.sql.*;
public class CreateConnection{
    public static void main(String[] args){
        try{
        
            //Load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //Create a connection
            String url="jdbc:mysql://localhost:3306/test";
            String username="root";
            String password="root";
            Connection conn=DriverManager.getConnection(url,username,password);

            if(conn.isClosed())
            {
                System.out.println("Connection is closed");
            }
            else
            {
                System.out.println("Connection Created");
            }

            //Create a query
            String q="create table table1(id int primary key auto_increment,name varchar(200) not null, city varchar(400))";

            //Create a statement
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created");

            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}