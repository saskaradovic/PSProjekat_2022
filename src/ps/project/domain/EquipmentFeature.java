/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.domain;

import java.math.BigDecimal;

/**
 *
 * @author saska
 */
public class EquipmentFeature {
    private Long automobileId;
    private Long equipmentId;
    private String name; //naziv
    private BigDecimal priceWithWat; //cena sa PDV-om
    private BigDecimal priceWithoutWat; //cena bez PDV-a
    private int equipmentStatus; //satus opreme 

    public EquipmentFeature() {
    }

    public EquipmentFeature(Long automobileId, Long equipmentId, String name, BigDecimal priceWithWat, BigDecimal priceWithoutWat, int equipmentStatus) {
        this.automobileId = automobileId;
        this.equipmentId = equipmentId;
        this.name = name;
        this.priceWithWat = priceWithWat;
        this.priceWithoutWat = priceWithoutWat;
        this.equipmentStatus = equipmentStatus;
    }

    public Long getAutomobileId() {
        return automobileId;
    }

    public void setAutomobileId(Long automobileId) {
        this.automobileId = automobileId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPriceWithWat() {
        return priceWithWat;
    }

    public void setPriceWithWat(BigDecimal priceWithWat) {
        this.priceWithWat = priceWithWat;
    }

    public BigDecimal getPriceWithoutWat() {
        return priceWithoutWat;
    }

    public void setPriceWithoutWat(BigDecimal priceWithoutWat) {
        this.priceWithoutWat = priceWithoutWat;
    }

    public int getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(int equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    @Override
    public String toString() {
        return "EquipmentFeature{" + "automobileId=" + automobileId + ", equipmentId=" + equipmentId + ", name=" + name + ", priceWithWat=" + priceWithWat + ", priceWithoutWat=" + priceWithoutWat + ", equipmentStatus=" + equipmentStatus + '}';
    }
    

    
}
