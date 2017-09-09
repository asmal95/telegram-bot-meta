package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class KickChatMember implements ApiMethod {

    public static final String METHOD = "kickChatMemberkickChatMember";

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
        return "KickChatMember{" +
                "chatId='" + chatId + '\'' +
                ", userId=" + userId +
                '}';
    }
}
