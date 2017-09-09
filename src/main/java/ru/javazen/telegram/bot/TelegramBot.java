package ru.javazen.telegram.bot;

import ru.javazen.telegram.bot.entity.Update;

public interface TelegramBot {

    String getName();

    String getToken();

    BotMethodExecutor getBotMethodExecutor();

    void handleUpdate(Update update);
}