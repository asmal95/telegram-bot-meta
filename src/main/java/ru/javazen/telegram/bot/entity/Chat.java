package ru.javazen.telegram.bot.entity;

/**
 * This object represents a chat.
 */
public class Chat {

    public static final String USER_CHAT_TYPE = "private";
    public static final String GROUP_CHAT_TYPE = "group";
    public static final String SUPERGROUP_CHAT_TYPE  = "supergroup";
    public static final String CHANNEL_CHAT_TYPE = "channel";

    /**
     * Unique identifier for this chat.
     */
    private Long id;

    /**
     * Type of chat, can be either "private", "group", "supergroup" or "channel".
     */
    private String type;

    /**
     * Title, for supergroups, channels and group chats.
     * <i>Optional.</i>
     */
    private String title;

    /**
     * Username, for private chats, supergroups and channels if available.
     * <i>Optional.</i>
     */
    private String userName;

    /**
     * First name of the other party in a private chat.
     * <i>Optional.</i>
     */
    private String firstName;

    /**
     * Last name of the other party in a private chat.
     * <i>Optional.</i>
     */
    private String lastName;

    /**
     * True if a group has "All Members Are Admins" enabled.
     * <i>Optional.</i>
     */
    private Boolean allMembersAreAdministrators;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
        this.allMembersAreAdministrators = allMembersAreAdministrators;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type=" + type +
                ", title=" + title +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", userName=" + userName +
                ", allMembersAreAdministrators=" + allMembersAreAdministrators +
                "}";
    }
}
