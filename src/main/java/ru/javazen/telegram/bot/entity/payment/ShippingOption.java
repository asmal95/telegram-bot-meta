package ru.javazen.telegram.bot.entity.payment;

import java.util.List;

/**
 * Created by Andrew on 07.07.2017.
 */
public class ShippingOption {


    private String id;
    private String title;
    private List<LabeledPrice> prices;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LabeledPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "ShippingOption{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", prices=" + prices +
                '}';
    }
}
