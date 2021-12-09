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
public class Automobile {
    private Long automobileId;
    private Long cubicCapacity; //zapremina motora
    private Long enginePower; //snaga motora
    private BigDecimal priceWithWat; //cena sa PDV-om
    private BigDecimal priceWithoutWat; //cena bez PDV-a
    private VechileType vechileType; //karoserija
    private Currency currency; //valuta
    private Fuel fuel; //gorivio
    private Long modelId;

    public Automobile() {
    }

    public Automobile(Long automobileId, Long cubicCapacity, Long enginePower, BigDecimal priceWithWat, BigDecimal priceWithoutWat, VechileType vechileType, Currency currency, Fuel fuel, Long modelId) {
        this.automobileId = automobileId;
        this.cubicCapacity = cubicCapacity;
        this.enginePower = enginePower;
        this.priceWithWat = priceWithWat;
        this.priceWithoutWat = priceWithoutWat;
        this.vechileType = vechileType;
        this.currency = currency;
        this.fuel = fuel;
        this.modelId = modelId;
    }

    public Long getAutomobileId() {
        return automobileId;
    }

    public void setAutomobileId(Long automobileId) {
        this.automobileId = automobileId;
    }

    public Long getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(Long cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public Long getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Long enginePower) {
        this.enginePower = enginePower;
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

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    @Override
    public String toString() {
        return "Automobile{" + "automobileId=" + automobileId + ", cubicCapacity=" + cubicCapacity + ", enginePower=" + enginePower + ", priceWithWat=" + priceWithWat + ", priceWithoutWat=" + priceWithoutWat + ", vechileType=" + vechileType + ", currency=" + currency + ", fuel=" + fuel + ", modelId=" + modelId + '}';
    }
    
    
    
    
}
