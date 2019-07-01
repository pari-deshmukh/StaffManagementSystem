/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagement.DomainData;

/**
 *
 * @author ssarkar
 */
public class PartTimeEmployee extends Employee{
    
    private double rate, contracted_hours;
    
    public PartTimeEmployee() {
    }
    
    public double getRate() {
        return rate;
    }
    
    public double getContractedHours() {
        return contracted_hours;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public void setContractedHours(double contracted_hours) {
        this.contracted_hours = contracted_hours;
    }
}
