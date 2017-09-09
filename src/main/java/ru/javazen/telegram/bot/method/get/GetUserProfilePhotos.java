package ru.javazen.telegram.bot.method.get;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetUserProfilePhotos implements ApiMethod {

    private static final String METHOD = "getUserProfilePhotos";

    private Integer userId;
    private Integer offset;
    private Integer limit;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "GetUserProfilePhotos{" +
                "userId=" + userId +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
