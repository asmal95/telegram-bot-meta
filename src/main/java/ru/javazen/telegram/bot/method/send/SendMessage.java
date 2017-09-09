package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SendMessage implements ApiMethod {

    private static final String METHOD = "sendMessage";

    private String chatId;
    private String text;
    private String parseMode;
    private Boolean disableWebPagePreview;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
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
        return "SendMessage{" +
                "chatId='" + chatId + '\'' +
                ", text='" + text + '\'' +
                ", parseMode='" + parseMode + '\'' +
                ", disableWebPagePreview=" + disableWebPagePreview +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                '}';
    }
}
