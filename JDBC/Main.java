import java.sql.*;
public class Main{
    public static void main(String [] args)
    {
        try{
            // Connection to database
            Connection conn=DriverManager.getConnection("jdbc:mysql:/home/bishwas/Desktop/code/Java/JDBC/test.db");
            
            Statement stmt=conn.createStatement();

            //Create table in Database test.db
            stmt.execute("CREATE TABLE CONTACTS (name TEXT,phone INTEGER,email TEXT)");

            stmt.execute("INSERT INTO CONTACTS (name,phone,email VALUES('Bishwas',934,'biswas@gmail.com'))");

            stmt.close();
            conn.close();


        }
        catch(SQLException e)
        {
            System.out.println("Not connected " + e.getMessage());
        }
    }
}