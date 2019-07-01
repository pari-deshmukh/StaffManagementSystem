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
public class ResetPasswordController {
    
    public static int attempt_password_reset(String username, String email, String new_password, String confirm_password) {
        PreparedStatement ps;
        ResultSet rs;
        int update;

        String confirmUnameQuery = "Select * FROM `emp_users` WHERE `uname` = ? AND `uemail` = ?";
        String updatePasswordquery = "UPDATE emp_users SET upass = ? WHERE uname = ? AND uemail = ?";

        try {
            ps = DbConnection.getConnection().prepareStatement(confirmUnameQuery);

            ps.setString(1, username);
            ps.setString(2, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                ps = DbConnection.getConnection().prepareStatement(updatePasswordquery);
                ps.setString(1, confirm_password);
                ps.setString(2, username);
                ps.setString(3, email);

                update = ps.executeUpdate();

                if (update > 0) {
                    return 0;    
                } else {
                    return 1;
                }
            } else {
                return 2;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
            return 3;
        }
    }
}
