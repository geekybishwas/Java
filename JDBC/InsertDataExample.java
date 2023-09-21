public class InsertDataExample{
    public static void main(String[] args){
        try
        {
            //Load thr driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create a connection
            String url="jdbc:mysql://localhost:3306/test";
            
            Connection conn=DriverManager.getConnection(url,"root","root");

            //Create a query
            String q="insert into contact(name,city) values (?,?)";

            //Get the Prepared Statement object

            PreparedStatement psmt=conn.prepareStatement(q);

            //set the values to query

            psmt.setString(1,"Bishwas");
            psmt.setString(2,"Pokhara");

            psmt.executeUpdate();

            System.out.println("Inserted");

            conn.close();
            psmt.close();

        }
        catch(SQLException e)
        {
            System.out.println("Not conneted " +e.getMessage());
        }
    }
}