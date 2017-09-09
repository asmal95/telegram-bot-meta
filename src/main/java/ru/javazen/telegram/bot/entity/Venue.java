package ru.javazen.telegram.bot.entity;

/**
 * This object represents a venue.
 */
public class Venue {

    /**
     * Venue location.
     */
    private Location location;

    /**
     * Name of the venue.
     */
    private String title;

    /**
     * Address of the venue.
     */
    private String address;

    /**
     * Foursquare identifier of the venue.
     * <i>Optional.</i>
     */
    private String foursquareId;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
        return "Venue{" +
                "location=" + location +
                ", title=" + title +
                ", address=" + address +
                ", foursquareId=" + foursquareId +
                "}";
    }
}
