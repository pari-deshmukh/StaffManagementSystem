/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic;

import StaffManagement.DataPersistence.EmployeeRepoImpl;

/**
 *
 * @author pdeshmukh
 */
public class DeleteEmployeeController {
    
    public static void deleteEmployee(int id) {
        EmployeeRepoImpl eri = new EmployeeRepoImpl();
        eri.delete(id);
    }
}
