package ru.javazen.telegram.bot.method.inline;

import ru.javazen.telegram.bot.entity.inline.result.InlineQueryResult;
import ru.javazen.telegram.bot.method.ApiMethod;

import java.util.List;

public class AnswerInlineQuery implements ApiMethod {

    private static final String METHOD = "answerInlineQuery";

    private String inlineQueryId;
    private List<InlineQueryResult> results;
    private Integer cacheTime;
    private Boolean isPersonal;
    private String nextOffset;
    private String switchPmText;
    private String switchPmParameter;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getInlineQueryId() {
        return inlineQueryId;
    }

    public void setInlineQueryId(String inlineQueryId) {
        this.inlineQueryId = inlineQueryId;
    }

    public List<InlineQueryResult> getResults() {
        return results;
    }

    public void setResults(List<InlineQueryResult> results) {
        this.results = results;
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
    }

    public Boolean getPersonal() {
        return isPersonal;
    }

    public void setPersonal(Boolean personal) {
        isPersonal = personal;
    }

    public String getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(String nextOffset) {
        this.nextOffset = nextOffset;
    }

    public String getSwitchPmText() {
        return switchPmText;
    }

    public void setSwitchPmText(String switchPmText) {
        this.switchPmText = switchPmText;
    }

    public String getSwitchPmParameter() {
        return switchPmParameter;
    }

    public void setSwitchPmParameter(String switchPmParameter) {
        this.switchPmParameter = switchPmParameter;
    }

    @Override
    public String toString() {
        return "AnswerInlineQuery{" +
                "inlineQueryId='" + inlineQueryId + '\'' +
                ", results=" + results +
                ", cacheTime=" + cacheTime +
                ", isPersonal=" + isPersonal +
                ", nextOffset='" + nextOffset + '\'' +
                ", switchPmText='" + switchPmText + '\'' +
                ", switchPmParameter='" + switchPmParameter + '\'' +
                '}';
    }
}