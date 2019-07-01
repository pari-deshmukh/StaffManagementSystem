/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic;

import StaffManagement.DataPersistence.EmployeeRepoImpl;
import StaffManagement.DomainData.Employee;
import StaffManagement.DomainData.EmployeeFactory;

import java.util.Date;

/**
 *
 * @author pdeshmukh
 */
public class AddEmployeeController {

    public static void addEmployee(String name, String type, String email, String address, Date doj, double salary, double rate, double hours) {
        EmployeeFactory empFactory = new EmployeeFactory();
        Employee emp = empFactory.emp(-1, name, type, email, address, doj, salary, rate, hours);        
        EmployeeRepoImpl eri = new EmployeeRepoImpl();
        eri.create(emp);
    }

}
