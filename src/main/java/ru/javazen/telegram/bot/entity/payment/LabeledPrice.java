package ru.javazen.telegram.bot.entity.payment;

/**
 * Created by Andrew on 07.07.2017.
 */
public class LabeledPrice {

    private String label;
    private Integer amount;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LabeledPrice{" +
                "label='" + label + '\'' +
                ", amount=" + amount +
                '}';
    }
}
