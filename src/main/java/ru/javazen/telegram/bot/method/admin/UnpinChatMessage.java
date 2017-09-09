package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class UnpinChatMessage implements ApiMethod {

    private static final String METHOD = "unpinChatMessage";

    private String chatId;

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

    @Override
    public String toString() {
        return "UnpinChatMessage{" +
                "chatId='" + chatId + '\'' +
                '}';
    }
}
