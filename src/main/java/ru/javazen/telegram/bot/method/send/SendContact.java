package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SendContact implements ApiMethod {

    private static final String METHOD = "sendContact";

    private String chatId;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Boolean disableNotification;
    private Integer replyToMessageId;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
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

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    @Override
    public String toString() {
        return "SendContact{" +
                "chatId='" + chatId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                '}';
    }
}
