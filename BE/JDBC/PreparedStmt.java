import java.mysql.*;
public class PreparedStmt{
    public static void main(String[] args){
        
        Class.forName("com.mysql.jdbc.Drvier");
        
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

        String q="insert into table (name,city) values(?,?)";

        PreparedStatement pstmt=conn.prepareStatement(q);

        pstmt.setString(1,"Bishwas");

        pstmt.setString(2,"Pokhara");

        pstmt.executeUpdate();

        System.out.println("INserted.......");

        conn.close();
    }
}