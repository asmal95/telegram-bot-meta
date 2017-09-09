package ru.javazen.telegram.bot.entity.payment;

/**
 * Created by Andrew on 07.07.2017.
 */
public class AnswerPreCheckoutQuery {

    private String preCheckoutQueryId;
    private Boolean ok;
    private String errorMessage;

    public String getPreCheckoutQueryId() {
        return preCheckoutQueryId;
    }

    public void setPreCheckoutQueryId(String preCheckoutQueryId) {
        this.preCheckoutQueryId = preCheckoutQueryId;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "AnswerPreCheckoutQuery{" +
                "preCheckoutQueryId='" + preCheckoutQueryId + '\'' +
                ", ok=" + ok +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
