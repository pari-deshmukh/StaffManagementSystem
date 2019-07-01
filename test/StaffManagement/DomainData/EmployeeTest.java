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
 * @author ssarkar
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
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new EmployeeImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Employee.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Employee instance = new EmployeeImpl();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Employee instance = new EmployeeImpl();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Employee instance = new EmployeeImpl();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoj method, of class Employee.
     */
    @Test
    public void testGetDoj() {
        System.out.println("getDoj");
        Employee instance = new EmployeeImpl();
        Date expResult = null;
        Date result = instance.getDoj();
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
