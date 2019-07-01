/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pdeshmukh
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new EmployeeImpl();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Employee instance = new EmployeeImpl();
        instance.setId(id);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Employee instance = new EmployeeImpl();
        instance.setName(name);
    }

    /**
     * Test of setType method, of class Employee.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "Part-time";
        Employee instance = new EmployeeImpl();
        instance.setType(type);
        
    }

    /**
     * Test of setEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Employee instance = new EmployeeImpl();
        instance.setEmail(email);
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Employee instance = new EmployeeImpl();
        instance.setAddress(address);
    }

    /**
     * Test of setDoj method, of class Employee.
     */
    @Test
    public void testSetDoj() {
        System.out.println("setDoj");
        Date doj = null;
        Employee instance = new EmployeeImpl();
        instance.setDoj(doj);
    }

    public class EmployeeImpl extends Employee {
    }
    
}
