package ru.javazen.telegram.bot.entity;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 */
public class MessageEntity {

    public static final String MENTION_TYPE = "mention";
    public static final String HASHTAG_TYPE = "hashtag";
    public static final String BOT_COMMAND_TYPE = "bot_command";
    public static final String URL_TYPE = "url";
    public static final String EMAIL_TYPE = "email";
    public static final String BOLD_TYPE = "bold";
    public static final String ITALIC_TYPE = "italic";
    public static final String CODE_TYPE = "code";
    public static final String PRE_TYPE = "pre";
    public static final String TEXT_LINK_TYPE = "text_link";
    public static final String TEXT_MENTION_TYPE = "text_mention";

    /**
     * Type of the entity.
     * Can be mention (@username), hashtag, bot_command, url,
     * email, bold (bold text), italic (italic text),
     * code (monowidth string), pre (monowidth block),
     * text_link (for clickable text URLs), text_mention (for users without usernames).
     */
    private String type;

    /**
     * Offset in UTF-16 code units to the start of the entity.
     */
    private Integer offset;

    /**
     * Length of the entity in UTF-16 code units.
     */
    private Integer length;

    /**
     * For "text_link" only, url that will be opened after user taps on the text.
     * <i>Optional.</i>
     */
    private String url;

    /**
     * For "text_mention" only, the mentioned user.
     * <i>Optional.</i>
     */
    private User user;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "type=" + type +
                ", offset=" + offset +
                ", length=" + length +
                ", url=" + url +
                ", user=" + user +
                "}";
    }
}
