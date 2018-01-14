package ru.javazen.telegram.bot.handler.filter;

import ru.javazen.telegram.bot.entity.Update;

public interface Filter {

    boolean check(Update update);

}
