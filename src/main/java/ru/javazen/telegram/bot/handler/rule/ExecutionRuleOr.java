package ru.javazen.telegram.bot.handler.rule;

import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.filter.Filter;

public class ExecutionRuleOr extends AbsExecutionExecutionRule {

    @Override
    public boolean execute(Update update) {
        boolean result = false;

        if (childrenRules != null) {
            for (ExecutionRule childrenRule : childrenRules) {
                result |= childrenRule.execute(update);
            }
        }

        if (filters != null) {
            for (Filter filter : filters) {
                result |= filter.check(update);
            }
        }

        return result;
    }

}