import java.mysql.*;
public class UpdateQuery{
    public static void main(String[] args){
        try
        {
            Class.forName("com.mysql.jc.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

            String q="Select * from table";

            Statement stmt=conn.createStatement();

            ResultSet set=stmt.executeQuery(q);

            while(set.next())
            {
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
            }

            conn.close();
            stmt.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}