package ru.javazen.telegram.bot.method.game;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.method.ApiMethod;

public class SendGame implements ApiMethod {

    private static final String METHOD = "sendGame";

    private Integer chatId;
    private String gameShortName;
    private Boolean disableNotification;
    private Integer replyToMessageId;
    private InlineKeyboardMarkup replyMarkup;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "SendGame{" +
                "chatId=" + chatId +
                ", gameShortName='" + gameShortName + '\'' +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
