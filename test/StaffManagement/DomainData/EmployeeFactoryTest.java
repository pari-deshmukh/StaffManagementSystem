/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

import java.util.Date;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

/**
 *
 * @author ssarkar
 */
public class EmployeeFactoryTest {
    
    public EmployeeFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of emp method, of class EmployeeFactory.
     */
    @Test
     public void testEmp() {
        System.out.println("emp");
        int id = 1;
        String name = "Pranali Deshmukh";
        String empType = "Part-time";
        String email = "pranali@email.com";
        String address = "Coventry, UK";
        Date doj = new Date();
        double salary = 0.0;
        double rate = 8;
        double hours = 20;
        EmployeeFactory instance = new EmployeeFactory();
        Employee result = instance.emp(id, name, empType, email, address, doj, salary, rate, hours);
        assertNotNull(result);
    }
    
}
