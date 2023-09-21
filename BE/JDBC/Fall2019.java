import java.mysql.*;
public class Fall2019{
    public static void main(String[] args){
        try{
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create a connection
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

            //Create a query
            String q="Select *from table where salary > ? ";

            //Create a preapered Statement
            PreparedStatement pstmt=conn.prepareStatement(q);

            pstmt.setInt(1,25000);

            //Result set to fetch the data
            ResultSet set=pstmt.executeQuery();

            System.out.println("Employes whose salary is > 25000");
            while(set.next())
            {
                int id=set.getInt("id");
                String name=set.getString("name");
                String post=set.getString("post");
                double salary=set.getDouble("salary");

                System.out.println("ID " +id + "Name :" + name + "Post : "+post + "Salary : "+salary);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}