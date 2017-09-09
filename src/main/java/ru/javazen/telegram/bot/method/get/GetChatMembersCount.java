package ru.javazen.telegram.bot.method.get;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetChatMembersCount implements ApiMethod {

    public static final String METHOD = "getChatMembersCount";

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
        return "GetChatMembersCount{" +
                "chatId='" + chatId + '\'' +
                '}';
    }
}
