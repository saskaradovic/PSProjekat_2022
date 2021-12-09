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
public class LegalPerson {
    private Long customerId;
    private String companyName; //naziv
    private String tin; //PIB
    private String companyNumber; //MB-Matricni broj firme

    public LegalPerson() {
    }

    public LegalPerson(Long customerId, String companyName, String tin, String companyNumber) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.tin = tin;
        this.companyNumber = companyNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    @Override
    public String toString() {
        return "LegalPerson{" + "customerId=" + customerId + ", companyName=" + companyName + ", tin=" + tin + ", companyNumber=" + companyNumber + '}';
    }
    
    
    
}
