import java.mysql.*;
import java.io.*;
public class DatabaseExample{
    public static void main(String[] args){

        //Load the driver
        Class.forName("com.mysql.cj.jdc.Driver");

        
        String url="jdbc.mysql://localhost:3306/testDB"
        
        //Connection established
        Connection conn=DriverManager.getConnection(url,"root","root");

        Statement stmt=conn.createStatement();

        String sql="CREATE TABLE employee (id int auto_increment,name varchar(40) not null,address varchar(40))";

        stmt.executeUpdate(sql);

        System.out.println("Table created succesfully");

        sql="INSERT INTO employee values (1,'Bishwas','pkr')";

        stmt.executeUpdate(sql);

        sql="INSERT INTO employee values (2,'Biswas','kr')";

        stmt.executeUpdate(sql);

        sql="INSERT INTO employee values (3,'Bias','r')";

        stmt.executeUpdate(sql);


        //Using prepared Statement

        String preparesql="INSERT INTO employee (id int auto_increment,name varchar(40),email varchar(40)) values (?,?,?)";

        PreparedStatement ps=conn.prepareStatement(preparesql);

        Scanner s=new Scanner();
        for(int i =0;i<3;i++)
        {
            System.out.println("Enter your id ,name and email");;
            int a=s.nextInt();
            String name=s.nextLine();
            Stirg email=s.nextLine();

            ps.setInt(1,a);
            ps.setString(2,name);
            ps.setString(3,email);

            ps.executeUpdate();
        }
        ps.close();
    }
}
// import java.sql.*;
// import java.util.Scanner;

// class database{
// 	public static void main(String [] args){
// 		try{
// 			//register JDBC driver
// 			Class.forName("com.mysql.cj.jdbc.Driver");
			
// 			//open jdbc connection
// 			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
// 			System.out.println("Connection created!");

// 			Statement stmt = conn.createStatement();
// 			String sql="";

// 			//DDL query
// 			//create table
// 			sql = "CREATE TABLE employee (id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, address VARCHAR(255) NOT NULL)";

// 			stmt.executeUpdate(sql);
// 			System.out.println("Table created!!");

// 			//insert into tables valuessss
// 			sql = "INSERT INTO employee VALUES(1,'john','malepatan')";
// 			stmt.executeUpdate(sql);
// 			sql= "INSERT INTO employee VALUES(2,'wick','ny')";
// 			stmt.executeUpdate(sql);
// 			sql="INSERT INTO employee VALUES(3,'dog','avergae')";
// 			stmt.executeUpdate(sql);
// 			System.out.println("insertion succes!");

// 			//using prepared statement
			
// 			String insertUsingPrepStmt = "INSERT INTO employee(id,name,address)"+" VALUES(?,?,?)";
// 			PreparedStatement prepStmt = conn.prepareStatement(insertUsingPrepStmt);
// 			Scanner scanner = new Scanner(System.in);
// 			for (int i = 0; i < 3; i++) {
//             	System.out.println("Enter id: ");
//             	int id = scanner.nextInt();

//          	   	System.out.println("Enter name: ");
//            		String name = scanner.next();

//            		System.out.println("Enter address: ");
//             	String address = scanner.next();

//             	prepStmt.setInt(1, id);
//             	prepStmt.setString(2, name);
//             	prepStmt.setString(3, address);
//             	prepStmt.executeUpdate();
// 			}
// 			conn.close();
// 			System.out.println("Connection closed!!");
// 		}
// 		catch(Exception e){
// 			e.printStackTrace();
// 		}
// 	}
// }