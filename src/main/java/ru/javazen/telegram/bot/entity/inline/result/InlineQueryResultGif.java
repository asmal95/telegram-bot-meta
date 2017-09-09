package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;

public class InlineQueryResultGif implements InlineQueryResult {

    private String type = "gif";
    private String id;
    private String gifUrl;
    private Integer gifWidth;
    private Integer gifHeight;
    private String thumbUrl;
    private String title;
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

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    public Integer getGifWidth() {
        return gifWidth;
    }

    public void setGifWidth(Integer gifWidth) {
        this.gifWidth = gifWidth;
    }

    public Integer getGifHeight() {
        return gifHeight;
    }

    public void setGifHeight(Integer gifHeight) {
        this.gifHeight = gifHeight;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "InlineQueryResultGif{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", gifUrl='" + gifUrl + '\'' +
                ", gifWidth=" + gifWidth +
                ", gifHeight=" + gifHeight +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", title='" + title + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
