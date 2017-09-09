package ru.javazen.telegram.bot.method;

import java.util.List;

public class SetWebhook implements ApiMethod {

    private static final String METHOD = "setWebhook";

    private String url;
    //InputFile certificate //TODO
    private Integer maxConnections;
    private List<String> allowedUpdates;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    public List<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    public void setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
    }

    @Override
    public String toString() {
        return "SetWebhook{" +
                "url='" + url + '\'' +
                ", maxConnections=" + maxConnections +
                ", allowedUpdates=" + allowedUpdates +
                '}';
    }
}