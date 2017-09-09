package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;

public class InlineQueryResultPhoto implements InlineQueryResult {

    private String type = "photo";
    private String id;
    private String photoUrl;
    private String thumbUrl;
    private Integer photoWidth;
    private Integer photoHeight;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getPhotoWidth() {
        return photoWidth;
    }

    public void setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
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
        return "InlineQueryResultPhoto{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", photoWidth=" + photoWidth +
                ", photoHeight=" + photoHeight +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
