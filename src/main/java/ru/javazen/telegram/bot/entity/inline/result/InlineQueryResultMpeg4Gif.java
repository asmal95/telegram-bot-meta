package ru.javazen.telegram.bot.entity.inline.result;

import ru.javazen.telegram.bot.entity.inline.result.content.InputMessageContent;
import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;

public class InlineQueryResultMpeg4Gif implements InlineQueryResult {

    private String type = "mpeg4_gif";
    private String id;
    private String mpeg4Url;
    private Integer mpeg4Width;
    private Integer mpeg4Height;
    private String thumb_url;
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

    public String getMpeg4Url() {
        return mpeg4Url;
    }

    public void setMpeg4Url(String mpeg4Url) {
        this.mpeg4Url = mpeg4Url;
    }

    public Integer getMpeg4Width() {
        return mpeg4Width;
    }

    public void setMpeg4Width(Integer mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
    }

    public Integer getMpeg4Height() {
        return mpeg4Height;
    }

    public void setMpeg4Height(Integer mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
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
        return "InlineQueryResultMpeg4Gif{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", mpeg4Url='" + mpeg4Url + '\'' +
                ", mpeg4Width=" + mpeg4Width +
                ", mpeg4Height=" + mpeg4Height +
                ", thumb_url='" + thumb_url + '\'' +
                ", title='" + title + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                ", inputMessageContent=" + inputMessageContent +
                '}';
    }
}
