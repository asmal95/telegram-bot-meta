package ru.javazen.telegram.bot.method.send;

import ru.javazen.telegram.bot.method.ApiMethod;

public class SendChatAction implements ApiMethod {

    private static final String METHOD = "sendChatAction";

    public static final String TYPING_ACTION = "typing";
    public static final String UPLOAD_PHOTO_ACTION = "upload_photo";
    public static final String RECORD_VIDEO_ACTION = "record_video";
    public static final String UPLOAD_VIDEO_ACTION = "upload_video";
    public static final String RECORD_AUDIO_ACTION = "record_audio";
    public static final String UPLOAD_AUDIO_ACTION = "upload_audio";
    public static final String UPLOAD_DOCUMENT_ACTION = "upload_document";
    public static final String FIND_LOCATION_ACTION = "find_location";

    private String chatId;
    private String action;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String toString() {
        return "SendChatAction{" +
                "chatId='" + chatId + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
