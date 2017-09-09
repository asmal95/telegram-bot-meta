package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SendPhoto implements ApiMethod {

    private static final String METHOD = "sendPhoto";

    private String chatId;
    private String photo;
    private String caption;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
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
        return "SendPhoto{" +
                "chatId='" + chatId + '\'' +
                ", photo='" + photo + '\'' +
                ", caption='" + caption + '\'' +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                '}';
    }
}
