package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class ForwardMessage implements ApiMethod {

    private static final String METHOD = "forwardMessage";

    private String chatId;
    private String fromChatId;
    private Boolean disableNotification;
    private Integer messageId;

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

    public String getFromChatId() {
        return fromChatId;
    }

    public void setFromChatId(String fromChatId) {
        this.fromChatId = fromChatId;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "ForwardMessage{" +
                "chatId='" + chatId + '\'' +
                ", fromChatId='" + fromChatId + '\'' +
                ", disableNotification=" + disableNotification +
                ", messageId=" + messageId +
                '}';
    }
}
