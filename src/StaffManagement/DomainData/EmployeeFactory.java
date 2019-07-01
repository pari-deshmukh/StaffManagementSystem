/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

import java.util.Date;

/**
 *
 * @author pdeshmukh
 */
public class EmployeeFactory {
    
    public Employee emp(int id, String name, String empType, String email, 
            String address, Date doj, double salary, double rate, double hours){
        if(empType == null) {
            return null;
        }
        
        if(empType.equalsIgnoreCase("Part-time")) {
            PartTimeEmployee emp = new PartTimeEmployee();
            if(id >= 0) {
                emp.setId(id);
            }
            emp.setName(name);
            emp.setEmail(email);
            emp.setAddress(address);
            emp.setDoj(doj);
            emp.setHours(hours);
            emp.setRate(rate);
            emp.setType("Part-time");
            return emp;
        } 
        else if(empType.equalsIgnoreCase("Full-time")) {
            FullTimeEmployee emp = new FullTimeEmployee();
            if(id >= 0) {
                emp.setId(id);
            }
            emp.setName(name);
            emp.setEmail(email);
            emp.setAddress(address);
            emp.setDoj(doj);
            emp.setSalary(salary);
            emp.setType("Full-time");
            return emp;
        }
        return null;
    }
    
}
