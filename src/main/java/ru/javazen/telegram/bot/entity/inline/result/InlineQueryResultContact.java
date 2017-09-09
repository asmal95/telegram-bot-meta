package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultContact implements InlineQueryResult {

    private String type = "contact";
    private String id;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private InlineKeyboardMarkup replyMarkup;
    private InputMessageContent inputMessageContent;
    private String thumbUrl;
    private Integer thumbWidth;
    private Integer thumbHeight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public void setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    @Override
    public String toString() {
        return "InlineQueryResultContact{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", thumbWidth=" + thumbWidth +
                ", thumbHeight=" + thumbHeight +
                '}';
    }
}
