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
public class City {
    private Long postalCode; 
    private String cityName; //naziv grada

    public City() {
    }

    public City(Long postalCode, String cityName) {
        this.postalCode = postalCode;
        this.cityName = cityName;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" + "postalCode=" + postalCode + ", cityName=" + cityName + '}';
    }
    
    
}
