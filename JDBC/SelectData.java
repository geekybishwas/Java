public class ConnectionExample{
    public static void main(String[] args){
        try
        {
            //Load thr driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create a connection
            String url="jdbl:mysql://localhost:3306/test";
            
            Connection conn=DriverManager.getConnection(url,"root","root");

            //Create a query

            String q="select * from contact";

            //Create a statement

            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(q);

            while(set.next())
            {
                int id=set.getInt(1); // The number inside () is column
                String name=set.getString(2);
                String city=set.getString(3);
                System.out.println();
            }
        }
        catch(SQLException e)
        {
            System.out.println("Not conneted " +e.getMessage());
        }
    }
}