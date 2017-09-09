package ru.javazen.telegram.bot.entity.inline.result.cached;

import ru.javazen.telegram.bot.entity.inline.result.InlineQueryResult;
import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;


public class InlineQueryResultCachedAudio implements InlineQueryResult {

    private String type = "audio";
    private String id;
    private String audioFileId;
    private String caption;
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

    public String getAudioFileId() {
        return audioFileId;
    }

    public void setAudioFileId(String audioFileId) {
        this.audioFileId = audioFileId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
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
        return "InlineQueryResultCachedAudio{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", audioFileId='" + audioFileId + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
