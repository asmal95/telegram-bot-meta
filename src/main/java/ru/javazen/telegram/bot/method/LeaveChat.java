package ru.javazen.telegram.bot.method;

public class LeaveChat implements ApiMethod {

    public static final String METHOD = "leaveChat";

    private String chatId;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String toString() {
        return "LeaveChat{" +
                "chatId='" + chatId + '\'' +
                '}';
    }
}
