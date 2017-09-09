package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SetChatDescription implements ApiMethod {

    private static final String METHOD = "setChatDescription";

    private String chatId;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SetChatDescription{" +
                "chatId='" + chatId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
