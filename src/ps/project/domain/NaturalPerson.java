/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.domain;

/**
 *
 * @author saska
 */
public class NaturalPerson {
    private int customerId;
    private String fullName; //ime i prezime
    private String personalNumber; //jmbg

    public NaturalPerson() {
    }

    public NaturalPerson(int customerId, String fullName, String personalNumber) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.personalNumber = personalNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "NaturalPerson{" + "customerId=" + customerId + ", fullName=" + fullName + ", personalNumber=" + personalNumber + '}';
    }
    
    
    
}
