package ru.javazen.telegram.bot.entity.inline.result.content;

public class InputLocationMessageContent implements InputMessageContent {

    private Double latitude;
    private Double longitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "InputLocationMessageContent{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
