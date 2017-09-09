package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultLocation implements InlineQueryResult {

    private String type = "location";
    private String id;
    private Double latitude;
    private Double longitude;
    private String title;
    private String description;
    private InlineKeyboardMarkup replyMarkup;
    private InputMessageContent inputMessageContent;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
        return "InlineQueryResultLocation{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", thumbWidth=" + thumbWidth +
                ", thumbHeight=" + thumbHeight +
                '}';
    }
}
