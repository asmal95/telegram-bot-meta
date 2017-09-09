package ru.javazen.telegram.bot.entity;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot,
 * the field message will be present. If the button was attached to a message sent via
 * the bot (in inline mode), the field inline_message_id will be present. Exactly one of
 * the fields data or game_short_name will be present.
 */
public class CallbackQuery {

    /**
     * Unique identifier for this query.
     */
    private String id;

    /**
     * Sender.
     */
    private User from;

    /**
     * Message with the callback button that originated the query.
     * Note that message content and message date will not be available if the message is too old.
     * <i>Optional.</i>
     */
    private Message message;

    /**
     * Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    private String inlineMessageId;

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with
     * the callback button was sent. Useful for high scores in games.
     */
    private String chatInstance;

    /**
     * Data associated with the callback button. Be aware that a bad client can send arbitrary data in this field.
     * <i>Optional.</i>
     */
    private String data;

    /**
     * Short name of a Game to be returned, serves as the unique identifier for the game.
     * <i>Optional.</i>
     */
    private String gameShortName;

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

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id=" + id +
                ", from=" + from +
                ", message=" + message +
                ", inlineMessageId=" + inlineMessageId +
                ", data=" + data +
                ", gameShortName=" + gameShortName +
                ", chatInstance=" + chatInstance +
                "}";
    }
}
