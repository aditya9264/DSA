package JDBC project.src;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprocss" , "root" , "Aditya@123");
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM Employee;");
       while(rs.next()){
        System.out.println(rs.getInt(1)+ " | " + rs.getString(2)+ " | "+rs.getString(3));

       }
    }
    
}
