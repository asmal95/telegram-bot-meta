package ru.javazen.telegram.bot.method.message;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.method.ApiMethod;

public class EditMessageCaption implements ApiMethod {

    private static final String METHOD = "editMessageCaption";

    private String chatId;
    private Integer messageId;
    private String inlineMessageId;
    private String caption;
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

    @Override
    public String toString() {
        return "EditMessageCaption{" +
                "chatId='" + chatId + '\'' +
                ", messageId=" + messageId +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", caption='" + caption + '\'' +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
