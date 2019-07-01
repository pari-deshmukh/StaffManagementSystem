/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DataPersistence;

import StaffManagement.DomainData.Employee;
import java.util.ArrayList;

/**
 *
 * @author ssarkar
 */
public interface EmployeeRepo {
    public ArrayList list();
    public void create(Employee emp);
    public Employee read(int id);
    public void update(Employee emp);
    public void delete(int id);
}
