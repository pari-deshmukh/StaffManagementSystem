/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic.EmployeeManagement;

import StaffManagement.DomainData.Employee;
import StaffManagement.DomainData.EmployeeFactory;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ssarkar
 */
public class AddEmployeeController {

//    ArrayList list = new ArrayList();
//
//    public ArrayList getEmployees() {
//        return list;
//    }
//
//    public void setEmpList(ArrayList empList) {
//        list = empList;
//    }

    public void addEmployee(int id, String name, String type, String email, String address, Date doj) {
        
        EmployeeFactory empFactory = new EmployeeFactory();
        Employee emp = empFactory.emp(id, name, type, email, address, doj);        
        
//        list.add(emp);
    }

}
