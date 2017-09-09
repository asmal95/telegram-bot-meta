package ru.javazen.telegram.bot.entity.payment;

/**
 * Created by Andrew on 07.07.2017.
 */
public class Invoice {

    private String title;
    private String description;
    private String startParameter;
    private String currency;
    private Integer totalAmount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "totalAmount=" + totalAmount +
                ", currency='" + currency + '\'' +
                ", startParameter='" + startParameter + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
