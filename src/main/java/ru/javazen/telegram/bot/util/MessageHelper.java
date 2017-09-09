package ru.javazen.telegram.bot.util;

import ru.javazen.telegram.bot.entity.Message;
import ru.javazen.telegram.bot.method.send.SendMessage;

public abstract class MessageHelper {

    public static SendMessage answer(Message message, String text, boolean reply){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChat().getId().toString());
        sendMessage.setText(text);
        if (reply){
            sendMessage.setReplyToMessageId(message.getMessageId());
        }
        return sendMessage;
    }

    public static SendMessage answer(Message message, String text){
        return answer(message, text, false);
    }

    public static String getActualText(Message message){
        return message.getText() != null ?
                message.getText() :
                message.getCaption();
    }
}