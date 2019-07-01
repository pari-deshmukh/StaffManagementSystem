/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.BusinessLogic;

import StaffManagement.DataPersistence.EmployeeRepoImpl;
import StaffManagement.DomainData.Employee;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pdeshmukh
 */
public class ListEmployeesController {
    static ArrayList list = new ArrayList();
    
    public ArrayList getEmployees() {
        return list;
    }
    
    public void setEmpList(ArrayList empList) {
        list = empList;
    }
    
    public static void listEmployees(DefaultTableModel etm) {
        EmployeeRepoImpl eri = new EmployeeRepoImpl();
        ArrayList<Employee> emp_list = eri.list();
        etm.setRowCount(0);
        Object[] row = new Object[6];
        for (int i=0;i<emp_list.size();i++) {
            row[0] = emp_list.get(i).getId();
            row[1] = emp_list.get(i).getName();
            row[2] = emp_list.get(i).getType();
            row[3] = emp_list.get(i).getEmail();
            row[4] = emp_list.get(i).getAddress();
            row[5] = emp_list.get(i).getDoj();
            etm.addRow(row);
        }
    }
}
