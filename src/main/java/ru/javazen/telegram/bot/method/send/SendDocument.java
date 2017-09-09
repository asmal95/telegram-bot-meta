package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SendDocument implements ApiMethod {

    private static final String METHOD = "sendDocument";

    private String chatId;
    private String document;
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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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
        return "SendDocument{" +
                "chatId='" + chatId + '\'' +
                ", document='" + document + '\'' +
                ", caption='" + caption + '\'' +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                '}';
    }
}
