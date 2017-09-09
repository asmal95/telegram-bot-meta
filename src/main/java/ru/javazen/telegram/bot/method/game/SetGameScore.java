package ru.javazen.telegram.bot.method.game;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SetGameScore implements ApiMethod {

    private static final String METHOD = "setGameScore";

    private Integer userId;
    private Integer score;
    private Boolean force;
    private Boolean disableEditMessage;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public Boolean getDisableEditMessage() {
        return disableEditMessage;
    }

    public void setDisableEditMessage(Boolean disableEditMessage) {
        this.disableEditMessage = disableEditMessage;
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
        return "SetGameScore{" +
                "userId=" + userId +
                ", score=" + score +
                ", force=" + force +
                ", disableEditMessage=" + disableEditMessage +
                ", chatId=" + chatId +
                ", messageId=" + messageId +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                '}';
    }
}
