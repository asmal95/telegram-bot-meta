package ru.javazen.telegram.bot.method.message;

import ru.javazen.telegram.bot.method.ApiMethod;

public class DeleteMessage implements ApiMethod {

    private static final String METHOD = "deleteMessage";

    private String chatId;
    private Integer messageId;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String toString() {
        return "DeleteMessage{" +
                "chatId='" + chatId + '\'' +
                ", messageId=" + messageId +
                '}';
    }
}
