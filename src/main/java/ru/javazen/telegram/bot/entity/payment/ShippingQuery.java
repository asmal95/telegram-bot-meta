package ru.javazen.telegram.bot.entity.payment;

import ru.javazen.telegram.bot.entity.User;

/**
 * Created by Andrew on 07.07.2017.
 */
public class ShippingQuery {

    private String id;
    private User from;
    private String invoicePayload;
    private ShippingAddress shippingAddress;

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

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "ShippingQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", invoicePayload='" + invoicePayload + '\'' +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
