package ru.javazen.telegram.bot.handler.rule;

import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.filter.Filter;

import java.util.List;

/**
 * Rule of execution. Allows to check execution possibility for Update.
 *
 * Contains filters and other rules.
 */
public interface ExecutionRule {

    /**
     * Check execution possibility for Update.
     * @param update Telegram Update
     * @return check result.
     */
    boolean execute(Update update);
}