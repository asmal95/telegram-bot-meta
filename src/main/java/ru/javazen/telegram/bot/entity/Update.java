package ru.javazen.telegram.bot.entity;

import ru.javazen.telegram.bot.entity.inline.ChosenInlineResult;
import ru.javazen.telegram.bot.entity.inline.InlineQuery;

public class Update {

    /**
     * 	The update‘s unique identifier. Update identifiers start from a certain positive number and increase sequentially.
     */
    private Integer updateId;

    /**
     * New incoming message of any kind — text, photo, sticker, etc.
     * <i>Optional.</i>
     */
    private Message message;

    /**
     * New version of a message that is known to the bot and was edited.
     * <i>Optional.</i>
     */
    private Message editedMessage;

    /**
     * New incoming channel post of any kind — text, photo, sticker, etc.
     * <i>Optional.</i>
     */
    private Message channelPost;

    /**
     * New version of a channel post that is known to the bot and was edited.
     * <i>Optional.</i>
     */
    private Message editedChannelPost;

    /**
     * New incoming inline query.
     * <i>Optional.</i>
     */
    private InlineQuery inlineQuery;

    /**
     * The result of an inline query that was chosen by a user and sent to their chat partner.
     * <i>Optional.</i>
     */
    private ChosenInlineResult chosenInlineQuery;

    /**
     * New incoming callback query.
     * <i>Optional.</i>
     */
    private CallbackQuery callbackQuery;

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public ChosenInlineResult getChosenInlineQuery() {
        return chosenInlineQuery;
    }

    public void setChosenInlineQuery(ChosenInlineResult chosenInlineQuery) {
        this.chosenInlineQuery = chosenInlineQuery;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", inlineQuery=" + inlineQuery +
                ", chosenInlineQuery=" + chosenInlineQuery +
                ", callbackQuery=" + callbackQuery +
                ", editedMessage=" + editedMessage +
                ", channelPost=" + channelPost +
                ", editedChannelPost=" + editedChannelPost +
                "}";
    }
}
