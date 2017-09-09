package ru.javazen.telegram.bot.method.get;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetChatMember implements ApiMethod {

    public static final String METHOD = "getChatMember";

    private String chatId;
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "GetChatMember{" +
                "chatId='" + chatId + '\'' +
                ", userId=" + userId +
                '}';
    }
}
