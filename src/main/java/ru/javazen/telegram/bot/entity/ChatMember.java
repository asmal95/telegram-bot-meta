package ru.javazen.telegram.bot.entity;

/**
 * This object contains information about one member of the chat.
 */
public class ChatMember {
    public static final String CREATOR_CHAT_MEMBER_TYPE = "creator";
    public static final String ADMINISTRATOR_CHAT_MEMBER_TYPE = "administrator";
    public static final String MEMBER_CHAT_MEMBER_TYPE = "member";
    public static final String LEFT_CHAT_MEMBER_TYPE = "left";
    public static final String KICKED_CHAT_MEMBER_TYPE = "kicked";

    /**
     * Information about the user.
     */
    private User user;

    /**
     * The member's status in the chat. Can be "creator", "administrator", "member", "left" or "kicked".
     */
    private String status;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChatMember{" +
                "user=" + user +
                ", status='" + status + '\'' +
                '}';
    }
}
