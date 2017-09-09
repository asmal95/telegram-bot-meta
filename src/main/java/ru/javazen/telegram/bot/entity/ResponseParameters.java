package ru.javazen.telegram.bot.entity;


/**
 * Contains information about why a request was unsuccessfull.
 */
public class ResponseParameters {

    /**
     * The group has been migrated to a supergroup with the specified identifier.
     * This number may be greater than 32 bits and some programming languages may
     * have difficulty/silent defects in interpreting it. But it is smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     * <i>Optional.</i>
     */
    private Integer migrateToChatId;

    /**
     * In case of exceeding flood control, the number of seconds left to wait before the request can be repeated.
     * <i>Optional.</i>
     */
    private Integer retryAfter;

    public Integer getMigrateToChatId() {
        return migrateToChatId;
    }

    public void setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public Integer getRetryAfter() {
        return retryAfter;
    }

    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }

    @Override
    public String toString() {
        return "ResponseParameters{" +
                "migrateToChatId=" + migrateToChatId +
                ", retryAfter=" + retryAfter +
                "}";
    }
}
