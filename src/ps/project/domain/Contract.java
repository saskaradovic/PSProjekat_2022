/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.domain;

import java.util.Date;

/**
 *
 * @author saska
 */
public class Contract {
    private Long customerId;
    private Long automobileId;
    private Date conclusionDate; //datum zaključenja ugovora
    private String note; //napomena

    public Contract() {
    }

    public Contract(Long customerId, Long automobileId, Date conclusionDate, String note) {
        this.customerId = customerId;
        this.automobileId = automobileId;
        this.conclusionDate = conclusionDate;
        this.note = note;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAutomobileId() {
        return automobileId;
    }

    public void setAutomobileId(Long automobileId) {
        this.automobileId = automobileId;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Contract{" + "customerId=" + customerId + ", automobileId=" + automobileId + ", conclusionDate=" + conclusionDate + ", note=" + note + '}';
    }
    
}
