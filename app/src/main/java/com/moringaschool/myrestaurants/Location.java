
package com.moringaschool.myrestaurants;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("address3")
    @Expose
    private Object address3;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("display_address")
    @Expose
    private List<String> displayAddress = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param zipCode
     * @param country
     * @param address3
     * @param address2
     * @param city
     * @param address1
     * @param displayAddress
     * @param state
     */
    public Location(String address1, String address2, Object address3, String city, String zipCode, String country, String state, List<String> displayAddress) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.state = state;
        this.displayAddress = displayAddress;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Object getAddress3() {
        return address3;
    }

    public void setAddress3(Object address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(List<String> displayAddress) {
        this.displayAddress = displayAddress;
    }

}
