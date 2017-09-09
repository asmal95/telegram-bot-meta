package ru.javazen.telegram.bot.entity.keyboard;

/**
 * This object represents one button of the reply keyboard.
 * For simple text buttons String can be used instead of this object to specify text of the button.
 * Optional fields are mutually exclusive.
 */
public class KeyboardButton {

    /**
     * Text of the button. If none of the optional fields are used,
     * it will be sent to the bot as a message when the button is pressed.
     */
    private String text;

    /**
     * If True, the user's phone number will be sent as a contact when the button is pressed.
     * Available in private chats only.
     * <i>Optional.</i>
     */
    private Boolean requestContact;

    /**
     * If True, the user's current location will be sent when the button is pressed.
     * Available in private chats only.
     * <i>Optional.</i>
     */
    private Boolean requestLocation;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }
}
