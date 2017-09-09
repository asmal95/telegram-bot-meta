package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class PinChatMessage implements ApiMethod {

    private static final String METHOD = "pinChatMessage";

    private String chatId;
    private Integer messageId;
    private Boolean disableNotification;

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

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    @Override
    public String toString() {
        return "PinChatMessage{" +
                "chatId='" + chatId + '\'' +
                ", messageId=" + messageId +
                ", disableNotification=" + disableNotification +
                '}';
    }
}
