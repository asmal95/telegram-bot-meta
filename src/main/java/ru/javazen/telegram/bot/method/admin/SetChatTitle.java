package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SetChatTitle implements ApiMethod {

    private static final String METHOD = "setChatTitle";

    private String chatId;
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SetChatTitle{" +
                "title='" + title + '\'' +
                ", chatId='" + chatId + '\'' +
                '}';
    }
}
