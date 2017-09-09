package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;

public class InlineQueryResultArticle implements InlineQueryResult {

    private String type = "article";
    private String id;
    private String title;
    private InputMessageContent inputMessageContent;
    private InlineKeyboardMarkup replyMarkup;
    private String url;
    private Boolean hideUrl;
    private String description;
    private String thumbUrl;
    private Integer thumbWidth;
    private Integer thumbHeight;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public void setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getHideUrl() {
        return hideUrl;
    }

    public void setHideUrl(Boolean hideUrl) {
        this.hideUrl = hideUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    @Override
    public String toString() {
        return "InlineQueryResultArticle{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", inputMessageContent=" + inputMessageContent +
                ", replyMarkup=" + replyMarkup +
                ", url='" + url + '\'' +
                ", hideUrl=" + hideUrl +
                ", description='" + description + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", thumbWidth=" + thumbWidth +
                ", thumbHeight=" + thumbHeight +
                '}';
    }
}
