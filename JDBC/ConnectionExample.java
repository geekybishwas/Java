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

            String q="create table contact(id int(20) auto_increment,name varchar(30) not null, city varchar(400))";

            //Create a statement

            Statement stmt=conn.createStatement();

            stmt.executeUpdate(q);
            
            System.out.println("Table created in  db");

            conn.close();

            stmt.close();
        }
        catch(SQLException e)
        {
            System.out.println("Not conneted " +e.getMessage());
        }
    }
}