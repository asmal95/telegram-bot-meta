package ru.javazen.telegram.bot.entity.payment;

/**
 * Created by Andrew on 07.07.2017.
 */
public class ShippingAddress {

    private String countryCode;
    private String state;
    private String city;
    private String streetLine1;
    private String streetLine2;
    private String postCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "countryCode='" + countryCode + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", streetLine1='" + streetLine1 + '\'' +
                ", streetLine2='" + streetLine2 + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
