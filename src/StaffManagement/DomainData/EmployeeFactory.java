/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

import java.util.Date;

/**
 *
 * @author ssarkar
 */
public class EmployeeFactory {
    
    public Employee emp(int id, String name, String empType, String email, String address, Date doj) {
        if(empType == null) {
            return null;
        }
        
        Employee emp = null;
        
        emp.setId(id);
        emp.setName(name);
        emp.setEmail(email);
        emp.setAddress(address);
        emp.setDoj(doj);
        
        if(empType.equalsIgnoreCase("Part-time")) {
            emp = new PartTimeEmployee();
            emp.setType("Part-time");
            return emp;
        } else if(empType.equalsIgnoreCase("Full-time")) {
            emp = new FullTimeEmployee();
            emp.setType("Full-time");
            return emp;
        }
        return null;
    }
    
}
