package ru.javazen.telegram.bot.method.message;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.method.ApiMethod;

public class EditMessageText implements ApiMethod {

    private static final String METHOD = "editMessageText";

    private String chatId;
    private Integer messageId;
    private String inlineMessageId;
    private String text;
    private String parseMode;
    private Boolean disableWebPagePreview;
    private InlineKeyboardMarkup replyMarkup;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "EditMessageText{" +
                "chatId='" + chatId + '\'' +
                ", messageId=" + messageId +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", text='" + text + '\'' +
                ", parseMode='" + parseMode + '\'' +
                ", disableWebPagePreview=" + disableWebPagePreview +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
