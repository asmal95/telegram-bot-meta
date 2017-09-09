package ru.javazen.telegram.bot.method.admin;

import ru.javazen.telegram.bot.method.ApiMethod;

public class RestrictChatMember implements ApiMethod {

    private static final String METHOD = "restrictChatMember";

    private String chatId;
    private Integer userId;
    private Integer untilDate;
    private Boolean canSendMessages;
    private Boolean canSendMediaMessages;
    private Boolean canSendOtherMessages;
    private Boolean canAddWebPagePreviews;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public void setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
    }

    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
    }

    @Override
    public String toString() {
        return "RestrictChatMember{" +
                "chatId='" + chatId + '\'' +
                ", userId=" + userId +
                ", untilDate=" + untilDate +
                ", canSendMessages=" + canSendMessages +
                ", canSendMediaMessages=" + canSendMediaMessages +
                ", canSendOtherMessages=" + canSendOtherMessages +
                ", canAddWebPagePreviews=" + canAddWebPagePreviews +
                '}';
    }
}
