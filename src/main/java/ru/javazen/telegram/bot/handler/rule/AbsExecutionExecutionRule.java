package ru.javazen.telegram.bot.handler.rule;

import ru.javazen.telegram.bot.handler.filter.Filter;

import java.util.List;

public abstract class AbsExecutionExecutionRule implements ExecutionRule {

    protected List<ExecutionRule> childrenRules;
    protected List<Filter> filters;

    public List<ExecutionRule> getChildrenRules() {
        return childrenRules;
    }

    public void setChildrenRules(List<ExecutionRule> childrenRules) {
        this.childrenRules = childrenRules;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
