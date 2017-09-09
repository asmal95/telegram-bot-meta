package ru.javazen.telegram.bot.entity;

import java.util.List;

/**
 * This object represents a message.
 */
public class Message {

    /**
     * Unique message identifier inside this chat.
     */
    private Integer messageId;

    /**
     * Sender, can be empty for messages sent to channels.
     * <i>Optional.</i>
     */
    private User from;

    /**
     * Date the message was sent in Unix time.
     */
    private Integer date;

    /**
     * Conversation the message belongs to.
     */
    private Chat chat;

    /**
     *  For forwarded messages, sender of the original message.
     * 	<i>Optional.</i>
     */
    private User forwardFrom;

    /**
     * For messages forwarded from a channel, information about the original channel.
     * <i>Optional.</i>
     */
    private Chat forwardFromChat;

    /**
     * For forwarded channel posts, identifier of the original message in the channel.
     * <i>Optional.</i>
     */
    private Integer forwardFromMessageId;

    /**
     * 	For forwarded messages, date the original message was sent in Unix time.
     * 	<i>Optional.</i>
     */
    private Integer forwardDate;

    /**
     * For replies, the original message. Note that the Message object
     * in this field will not contain further reply_to_message fields even if it itself is a reply.
     * <i>Optional.</i>
     */
    private Message replyToMessage;

    /**
     * Date the message was last edited in Unix time.
     * <i>Optional.</i>
     */
    private Integer editDate;

    /**
     * For text messages, the actual UTF-8 text of the message, 0-4096 characters.
     * <i>Optional.</i>
     */
    private String text;

    /**
     * For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text.
     * <i>Optional.</i>
     */
    private List<MessageEntity> entities;

    /**
     * Message is an audio file, information about the file.
     * <i>Optional.</i>
     */
    private Audio audio;

    /**
     * Message is a general file, information about the file.
     * <i>Optional.</i>
     */
    private Document document;

    /**
     * Message is a game, information about the game.
     * Optional.
     */
    /*private Game game;*/

    /**
     * Message is a photo, available sizes of the photo.
     * <i>Optional.</i>
     */
    private List<PhotoSize> photo;

    /**
     * Message is a sticker, information about the sticker.
     * <i>Optional.</i>
     */
    private Sticker sticker;

    /**
     * Message is a video, information about the video.
     * <i>Optional.</i>
     */
    private Video video;

    /**
     * Message is a voice message, information about the file.
     * <i>Optional.</i>
     */
    private Voice voice;

    /**
     * Caption for the document, photo or video, 0-200 characters.
     * <i>Optional.</i>
     */
    private String caption; ///< Optional. Caption for the document, photo or video, 0-200 characters

    /**
     * Message is a shared contact, information about the contact.
     * <i>Optional.</i>
     */
    private Contact contact; ///< Optional. Message is a shared contact, information about the contact

    /**
     * Message is a shared location, information about the location.
     * <i>Optional.</i>
     */
    private Location location;

    /**
     * Message is a venue, information about the venue.
     * <i>Optional.</i>
     */
    private Venue venue;

    /**
     * A new member was added to the group, information about them (this member may be the bot itself).
     * <i>Optional.</i>
     */
    private User newChatMember;

    /**
     * A member was removed from the group, information about them (this member may be the bot itself).
     * <i>Optional.</i>
     */
    private User leftChatMember;

    /**
     * A chat title was changed to this value.
     * <i>Optional.</i>
     */
    private String newChatTitle;

    /**
     * A chat photo was change to this value.
     * <i>Optional.</i>
     */
    private List<PhotoSize> newChatPhoto;

    /**
     * Service message: the chat photo was deleted.
     * <i>Optional.</i>
     */
    private Boolean deleteChatPhoto;

    /**
     * Service message: the group has been created.
     * <i>Optional.</i>
     */
    private Boolean groupChatCreated;

    /**
     * Service message: the supergroup has been created.
     * This field can‘t be received in a message coming through
     * updates, because bot can’t be a member of a supergroup
     * when it is created. It can only be found in reply_to_message
     * if someone replies to a very first message in a directly
     * created supergroup.
     * <i>Optional.</i>
     */
    private Boolean supergroupChatCreated;

    /**
     * Service message: the channel has been created.
     * This field can‘t be received in a message coming
     * through updates, because bot can’t be a member
     * of a channel when it is created. It can only be
     * found in reply_to_message if someone replies to
     * a very first message in a channel.
     * <i>Optional.</i>
     */
    private Boolean channelChatCreated;

    /**
     * The group has been migrated to a supergroup with the specified identifier.
     * This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it.
     * But it smaller than 52 bits, so a signed 64 bit integer or double-precision
     * float type are safe for storing this identifier.
     * <i>Optional.</i>
     */
    private Long migrateToChatId;

    /**
     * The supergroup has been migrated from a group with the specified identifier.
     * This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it.
     * But it smaller than 52 bits, so a signed 64 bit integer or double-precision
     * float type are safe for storing this identifier.
     * <i>Optional.</i>
     */
    private Long migrateFromChatId;

    /**
     * Specified message was pinned.
     * Note that the Message object in this field will not contain
     * further reply_to_message fields even if it is itself a reply.
     * <i>Optional.</i>
     */
    private Message pinnedMessage;

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public void setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    public User getNewChatMember() {
        return newChatMember;
    }

    public void setNewChatMember(User newChatMember) {
        this.newChatMember = newChatMember;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    /*public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }*/

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public void setEditDate(Integer editDate) {
        this.editDate = editDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public Integer getForwardDate() {
        return forwardDate;
    }

    public void setForwardDate(Integer forwardDate) {
        this.forwardDate = forwardDate;
    }

    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public void setForwardFromMessageId(Integer forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forwardFrom=" + forwardFrom +
                ", forwardFromChat=" + forwardFromChat +
                ", forwardFromMessageId=" + forwardFromMessageId +
                ", forwardDate=" + forwardDate +
                ", replyToMessage=" + replyToMessage +
                ", editDate=" + editDate +
                ", text='" + text + '\'' +
                ", entities=" + entities +
                ", audio=" + audio +
                ", document=" + document +
                ", photo=" + photo +
                ", sticker=" + sticker +
                ", video=" + video +
                ", voice=" + voice +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", venue=" + venue +
                ", newChatMember=" + newChatMember +
                ", leftChatMember=" + leftChatMember +
                ", newChatTitle='" + newChatTitle + '\'' +
                ", newChatPhoto=" + newChatPhoto +
                ", deleteChatPhoto=" + deleteChatPhoto +
                ", groupChatCreated=" + groupChatCreated +
                ", supergroupChatCreated=" + supergroupChatCreated +
                ", channelChatCreated=" + channelChatCreated +
                ", migrateToChatId=" + migrateToChatId +
                ", migrateFromChatId=" + migrateFromChatId +
                ", pinnedMessage=" + pinnedMessage +
                '}';
    }
}
