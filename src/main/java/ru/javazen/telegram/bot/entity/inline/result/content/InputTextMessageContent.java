package ru.javazen.telegram.bot.entity.inline.result.content;

public class InputTextMessageContent implements InputMessageContent {

    private String messageText;
    private String parseMode;
    private Boolean disableWebPagePreview;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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

    @Override
    public String toString() {
        return "InputTextMessageContent{" +
                "messageText='" + messageText + '\'' +
                ", parseMode='" + parseMode + '\'' +
                ", disableWebPagePreview=" + disableWebPagePreview +
                '}';
    }
}
