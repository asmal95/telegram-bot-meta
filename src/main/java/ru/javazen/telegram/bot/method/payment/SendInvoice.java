package ru.javazen.telegram.bot.method.payment;

import ru.javazen.telegram.bot.entity.keyboard.InlineKeyboardMarkup;
import ru.javazen.telegram.bot.method.ApiMethod;

import java.util.List;

public class SendInvoice implements ApiMethod {

    private static final String METHOD = "sendInvoice";

    private Integer chatId;
    private String title;
    private String payload;
    private String providerToken;
    private String startParameter;
    private String currency;
    private List<String> prices; //todo list of LabeledPrice
    private String photoUrl;
    private String description;
    private Integer photoSize;
    private Integer photoWeight;
    private Integer photoHeight;
    private Boolean needName;
    private Boolean needPhotoNumber;
    private Boolean needEmail;
    private Boolean needShippingAddress;
    private Boolean isFlexible;
    private Integer replyToMessageId;
    private InlineKeyboardMarkup replyMarkup;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getProviderToken() {
        return providerToken;
    }

    public void setProviderToken(String providerToken) {
        this.providerToken = providerToken;
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

    public List<String> getPrices() {
        return prices;
    }

    public void setPrices(List<String> prices) {
        this.prices = prices;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPhotoSize() {
        return photoSize;
    }

    public void setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
    }

    public Integer getPhotoWeight() {
        return photoWeight;
    }

    public void setPhotoWeight(Integer photoWeight) {
        this.photoWeight = photoWeight;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
    }

    public Boolean getNeedName() {
        return needName;
    }

    public void setNeedName(Boolean needName) {
        this.needName = needName;
    }

    public Boolean getNeedPhotoNumber() {
        return needPhotoNumber;
    }

    public void setNeedPhotoNumber(Boolean needPhotoNumber) {
        this.needPhotoNumber = needPhotoNumber;
    }

    public Boolean getNeedEmail() {
        return needEmail;
    }

    public void setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
    }

    public Boolean getNeedShippingAddress() {
        return needShippingAddress;
    }

    public void setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
    }

    public Boolean getFlexible() {
        return isFlexible;
    }

    public void setFlexible(Boolean flexible) {
        isFlexible = flexible;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "SendInvoice{" +
                "chatId=" + chatId +
                ", title='" + title + '\'' +
                ", payload='" + payload + '\'' +
                ", providerToken='" + providerToken + '\'' +
                ", startParameter='" + startParameter + '\'' +
                ", currency='" + currency + '\'' +
                ", prices=" + prices +
                ", photoUrl='" + photoUrl + '\'' +
                ", description='" + description + '\'' +
                ", photoSize=" + photoSize +
                ", photoWeight=" + photoWeight +
                ", photoHeight=" + photoHeight +
                ", needName=" + needName +
                ", needPhotoNumber=" + needPhotoNumber +
                ", needEmail=" + needEmail +
                ", needShippingAddress=" + needShippingAddress +
                ", isFlexible=" + isFlexible +
                ", replyToMessageId=" + replyToMessageId +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
