package ru.javazen.telegram.bot.entity;

/**
 * This object represents a phone contact.
 */
public class Contact {

    /**
     * Contact's phone number.
     */
    private String phoneNumber;

    /**
     * Contact's first name.
     */
    private String firstName;

    /**
     * Contact's last name.
     * <i>Optional.</i>
     */
    private String lastName;

    /**
     * Contact's user identifier in Telegram.
     * <i>Optional.</i>
     */
    private Integer userId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", userId=" + userId +
                "}";
    }
}
