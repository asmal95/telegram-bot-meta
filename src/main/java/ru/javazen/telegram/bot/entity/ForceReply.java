package ru.javazen.telegram.bot.entity;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply
 * interface to the user (act as if the user has selected the bot‘s message and tapped 'Reply').
 * This can be extremely useful if you want to create user-friendly step-by-step interfaces without
 * having to sacrifice privacy mode.
 */
public class ForceReply {

    /**
     * Shows reply interface to the user, as if they manually selected the bot's message and tapped 'Reply'.
     */
    private Boolean forceReply;

    /**
     * Use this parameter if you want to force reply from specific users only.
     * Targets: 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     * <i>Optional.</i>
     */
    private Boolean selective;

    public Boolean getForceReply() {
        return forceReply;
    }

    public void setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    @Override
    public String toString() {
        return "ForceReply{" +
                "forceReply=" + forceReply +
                ", selective=" + selective +
                '}';
    }
}
