/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DataPersistence;

//Import packages for MySQL Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pdeshmukh
 */
public class DbConnection {
    
    // Function to connect with MySQL Database
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/employees","empadmin","emppassword");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
