/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DataPersistence;

import StaffManagement.DomainData.Employee;
import StaffManagement.DomainData.EmployeeFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ssarkar
 */
public class EmployeeRepoImpl implements EmployeeRepo {

    private ArrayList<Employee> employees;
    private Employee employee;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
        
    @Override
    public ArrayList list() {
        ArrayList list = new ArrayList();
        query = "Select * FROM `emp_employees`";

        try {
            ps = DbConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String emp_type = rs.getString("emp_type");
                String email = rs.getString("email");
                String address = rs.getString("address");
                Date doj = rs.getDate("doj");
                double salary = rs.getDouble("salary");
                double rate = rs.getDouble("rate");
                double hours = rs.getDouble("hours");
                
                EmployeeFactory empFactory = new EmployeeFactory();
                Employee emp = empFactory.emp(id, name, emp_type, email, address, doj, salary, rate, hours);

                list.add(emp);
            }

            rs.close();
            ps.close();
        } catch (SQLException ex1) {
            Logger.getLogger(EmployeeRepoImpl.class.getName()).log(Level.SEVERE, null, ex1);
        }
        employees = list;
        return employees;
    }

    @Override
    public void create(Employee emp) {
        query = "INSERT INTO `emp_employees` (`id`, `name`, `emp_type`, `email`, `address`, `doj`) VALUES (?, ? , ? , ? , ? , ?)";
        try {
            ps = DbConnection.getConnection().prepareStatement(query);
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getType());
            ps.setString(4, emp.getEmail());
            ps.setString(5, emp.getAddress());
            ps.setObject(6, emp.getDoj());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Employee read(int id) {
        query = "Select * FROM `emp_employees` where id = ?";

        try {
            ps = DbConnection.getConnection().prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String emp_type = rs.getString("emp_type");
                String email = rs.getString("email");
                String address = rs.getString("address");
                Date doj = rs.getDate("doj");
                double salary = rs.getDouble("salary");
                double rate = rs.getDouble("rate");
                double hours = rs.getDouble("hours");
                
                EmployeeFactory empFactory = new EmployeeFactory();
                employee = empFactory.emp(id, name, emp_type, email, address, doj, salary, rate, hours);
            }
            
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
    public void update(Employee emp) {
        query = "UPDATE `emp_employees` SET name = ?, emp_type = ?, email = ?, address = ?, doj = ? where id = ?";

        try {
            ps = DbConnection.getConnection().prepareStatement(query);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getType());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getAddress());
            ps.setObject(5, emp.getDoj());
            ps.setInt(6, emp.getId());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            query = "Delete FROM `emp_employees` where id='" + id + "'";
            ps = DbConnection.getConnection().prepareStatement(query);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
