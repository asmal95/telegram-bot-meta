package ru.javazen.telegram.bot.handler;

import ru.javazen.telegram.bot.BotMethodExecutor;
import ru.javazen.telegram.bot.entity.Update;

public abstract class SimpleHandler implements Handler {

    @Override
    public boolean executeHandler(Update update, BotMethodExecutor executor) {
        return handle(update, executor);
    }
}