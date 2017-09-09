package ru.javazen.telegram.bot.entity;

/**
 * This object represents a point on the map.
 */
public class Location {

    /**
     * Longitude as defined by sender.
     */
    private Double longitude;

    /**
     * Latitude as defined by sender.
     */
    private Double latitude;

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
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                "}";
    }
}
