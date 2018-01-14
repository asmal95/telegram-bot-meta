package ru.javazen.telegram.bot.handler;

import ru.javazen.telegram.bot.BotMethodExecutor;
import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.rule.ExecutionRuleAnd;

public abstract class FilteredHandler implements Handler {

    private ExecutionRuleAnd executionRuleAnd;

    @Override
    public final boolean executeHandler(Update update, BotMethodExecutor executor) {
        return executionRuleAnd.execute(update) && handle(update, executor);
    }

    public ExecutionRuleAnd getExecutionRuleAnd() {
        return executionRuleAnd;
    }

    public void setExecutionRuleAnd(ExecutionRuleAnd executionRuleAnd) {
        this.executionRuleAnd = executionRuleAnd;
    }
}