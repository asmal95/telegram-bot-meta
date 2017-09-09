package ru.javazen.telegram.bot.entity;

/**
 * This object represents a Telegram user or bot.
 */
public class User {

    /**
     * Unique identifier for this user or bot.
     */
    private Integer id;

    /**
     * User's or bot's first name.
     */
    private String firstName;

    /**
     * User's or bot's last name.
     * <i>Optional.</i>
     */
    private String lastName;

    /**
     * User's or bot's username.
     * <i>Optional.</i>
     */
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", userName=" + userName +
                "}";
    }
}
