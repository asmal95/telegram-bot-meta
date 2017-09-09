package ru.javazen.telegram.bot.method.game;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetGameHighScores implements ApiMethod {

    private static final String METHOD = "getGameHighScores";

    private Integer userId;
    private Integer chatId;
    private Integer messageId;
    private String inlineMessageId;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
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

    @Override
    public String toString() {
        return "GetGameHighScores{" +
                "userId=" + userId +
                ", chatId=" + chatId +
                ", messageId=" + messageId +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                '}';
    }
}
