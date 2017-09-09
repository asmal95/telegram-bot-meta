package ru.javazen.telegram.bot.method;

public class AnswerCallbackQuery implements ApiMethod {

    public static final String METHOD = "answerCallbackQuery";

    private String callbackQueryId;
    private String text;
    private Boolean showAlert;
    private String url;
    private Integer cacheTime;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getCallbackQueryId() {
        return callbackQueryId;
    }

    public void setCallbackQueryId(String callbackQueryId) {
        this.callbackQueryId = callbackQueryId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getShowAlert() {
        return showAlert;
    }

    public void setShowAlert(Boolean showAlert) {
        this.showAlert = showAlert;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
    }

    @Override
    public String toString() {
        return "AnswerCallbackQuery{" +
                "callbackQueryId='" + callbackQueryId + '\'' +
                ", text='" + text + '\'' +
                ", showAlert=" + showAlert +
                ", url='" + url + '\'' +
                ", cacheTime=" + cacheTime +
                '}';
    }
}
