/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

/**
 *
 * @author pdeshmukh
 */
public class PartTimeEmployee extends Employee{
    
    private double rate, hours;
    
    public PartTimeEmployee() {
    }
    
    public double getRate() {
        return rate;
    }
    
    public double getHours() {
        return hours;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }
}
