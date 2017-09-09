package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultGame implements InlineQueryResult {

    private String type = "game";
    private String id;
    private String gameShortName;
    private InlineKeyboardMarkup replyMarkup;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "InlineQueryResultGame{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", gameShortName='" + gameShortName + '\'' +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
