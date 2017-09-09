package ru.javazen.telegram.bot.entity.inline.result.content;

public class InputVenueMessageContent implements InputMessageContent {

    private Double latitude;
    private Double longitude;
    private String title;
    private String address;
    private String foursquareId;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    @Override
    public String toString() {
        return "InputVenueMessageContent{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", foursquareId='" + foursquareId + '\'' +
                '}';
    }
}
