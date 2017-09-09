package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SetChatPhoto implements ApiMethod {

    private static final String METHOD = "setChatPhoto";

    private String chatId;
    private String photo; // todo use InputFile

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "SetChatPhoto{" +
                "chatId='" + chatId + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
