package ru.javazen.telegram.bot.handler;

import ru.javazen.telegram.bot.BotMethodExecutor;
import ru.javazen.telegram.bot.entity.Update;

public interface Handler {

    boolean executeHandler(Update update, BotMethodExecutor executor);

    boolean handle(Update update, BotMethodExecutor executor);

}
