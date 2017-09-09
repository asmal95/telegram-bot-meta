package ru.javazen.telegram.bot.entity.inline.result.cached;

import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultCachedSticker {

    private String type = "sticker";
    private String id;
    private String stickerFileId;
    private InlineKeyboardMarkup replyMarkup;
    private InputMessageContent inputMessageContent;

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

    public String getStickerFileId() {
        return stickerFileId;
    }

    public void setStickerFileId(String stickerFileId) {
        this.stickerFileId = stickerFileId;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public void setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
    }

    @Override
    public String toString() {
        return "InlineQueryResultCachedSticker{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", stickerFileId='" + stickerFileId + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
