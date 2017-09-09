package ru.javazen.telegram.bot.entity.payment;

import ru.javazen.telegram.bot.entity.User;

/**
 * Created by Andrew on 07.07.2017.
 */
public class PreCheckoutQuery {

    private String id;
    private User from;
    private String currency;
    private Integer totalAmount;
    private String invoicePayload;
    private String shippingOptionId;
    private OrderInfo orderInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
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

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String   toString() {
        return "PreCheckoutQuery{" +
                "orderInfo=" + orderInfo +
                ", shippingOptionId='" + shippingOptionId + '\'' +
                ", invoicePayload='" + invoicePayload + '\'' +
                ", totalAmount=" + totalAmount +
                ", currency='" + currency + '\'' +
                ", from=" + from +
                ", id='" + id + '\'' +
                '}';
    }
}
