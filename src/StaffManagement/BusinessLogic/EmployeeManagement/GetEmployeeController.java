/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic.EmployeeManagement;

import StaffManagement.DataPersistence.EmployeeRepoImpl;
import StaffManagement.DomainData.Employee;

/**
 *
 * @author ssarkar
 */
public class GetEmployeeController {
    public static Employee getEmployee(int id) {
        EmployeeRepoImpl eri = new EmployeeRepoImpl();
        return eri.read(id);
    }
}
