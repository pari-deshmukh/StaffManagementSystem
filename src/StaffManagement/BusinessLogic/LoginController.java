/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import StaffManagement.UserInterface.LoginUI;
import StaffManagement.DataPersistence.DbConnection;

/**
 *
 * @author ssarkar
 */
public class LoginController {
    public static Boolean attempt_login(String username, String password) {
        PreparedStatement ps;
        ResultSet rs;
        
        String query = "Select * FROM `emp_users` WHERE `uname` = ? AND `upass` = ?";
        
        try {
            
            ps = DbConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
