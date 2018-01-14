package ru.javazen.telegram.bot.handler.rule;

import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.filter.Filter;

import java.util.Iterator;

public class ExecutionRuleAnd extends AbsExecutionExecutionRule {

    @Override
    public boolean execute(Update update) {
        boolean result = true;

        if (childrenRules != null && !childrenRules.isEmpty()) {
            Iterator<ExecutionRule> rulesIt = childrenRules.iterator();

            while (rulesIt.hasNext() && result) {
                result &= rulesIt.next().execute(update);
            }
        }

        if (result && filters != null && !filters.isEmpty()) {
            Iterator<Filter> filtersIt = filters.iterator();

            while (filtersIt.hasNext() && result) {
                result &= filtersIt.next().check(update);
            }
        }

        return result;
    }
}