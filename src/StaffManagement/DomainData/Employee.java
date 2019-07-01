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
public abstract class Employee {
    private int id;
    private String name, type, email, address;
    private Date doj;
    
    public Employee() {
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public Date getDoj() {
        return doj;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }    
}