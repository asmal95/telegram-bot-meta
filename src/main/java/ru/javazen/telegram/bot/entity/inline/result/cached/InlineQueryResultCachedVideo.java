package ru.javazen.telegram.bot.entity.inline.result.cached;

import ru.javazen.telegram.bot.entity.inline.result.InlineQueryResult;
import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultCachedVideo implements InlineQueryResult {

    private String type = "video";
    private String id;
    private String videoFileId;
    private String title;
    private String description;
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

    public String getVideoFileId() {
        return videoFileId;
    }

    public void setVideoFileId(String videoFileId) {
        this.videoFileId = videoFileId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "InlineQueryResultCachedVideo{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", videoFileId='" + videoFileId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
