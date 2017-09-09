package ru.javazen.telegram.bot.entity.payment;

import java.util.List;

/**
 * Created by Andrew on 07.07.2017.
 */
public class AnswerShippingQuery {

    private String shippingQueryId;
    private Boolean ok;
    private List<ShippingOption> shippingOptions;
    private String errorMessage;

    public String getShippingQueryId() {
        return shippingQueryId;
    }

    public void setShippingQueryId(String shippingQueryId) {
        this.shippingQueryId = shippingQueryId;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "AnswerShippingQuery{" +
                "shippingQueryId='" + shippingQueryId + '\'' +
                ", ok=" + ok +
                ", shippingOptions=" + shippingOptions +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
