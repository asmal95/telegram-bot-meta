package ru.javazen.telegram.bot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.filter.Filter;
import ru.javazen.telegram.bot.handler.rule.ExecutionRuleAnd;
import ru.javazen.telegram.bot.handler.rule.ExecutionRuleOr;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class RulesTest {

    @Test
    public void testAndTrue() {
        Update update = mock(Update.class);
        ExecutionRuleAnd ruleAnd = new ExecutionRuleAnd();

        Filter trueFilter = mock(Filter.class);
        when(trueFilter.check(update)).thenReturn(true);

        ruleAnd.setFilters(Arrays.asList(trueFilter));

        Assert.assertTrue(ruleAnd.execute(update));
    }

    @Test
    public void testAndFalse() {
        Update update = mock(Update.class);
        ExecutionRuleAnd ruleAnd = new ExecutionRuleAnd();

        Filter falseFilter = mock(Filter.class);
        when(falseFilter.check(update)).thenReturn(false);

        ruleAnd.setFilters(Arrays.asList(falseFilter));

        Assert.assertFalse(ruleAnd.execute(update));
    }

    @Test
    public void testAndTrueFalse() {
        Update update = mock(Update.class);
        ExecutionRuleAnd ruleAnd = new ExecutionRuleAnd();

        Filter trueFilter = mock(Filter.class);
        when(trueFilter.check(update)).thenReturn(true);

        Filter falseFilter = mock(Filter.class);
        when(trueFilter.check(update)).thenReturn(false);

        ruleAnd.setFilters(Arrays.asList(trueFilter, falseFilter));

        Assert.assertFalse(ruleAnd.execute(update));
    }

    @Test
    public void testOrTrue() {
        Update update = mock(Update.class);
        ExecutionRuleOr ruleOr = new ExecutionRuleOr();

        Filter trueFilter = mock(Filter.class);
        when(trueFilter.check(update)).thenReturn(true);

        ruleOr.setFilters(Arrays.asList(trueFilter));

        Assert.assertTrue(ruleOr.execute(update));
    }

    @Test
    public void testOrFalse() {
        Update update = mock(Update.class);
        ExecutionRuleOr ruleOr = new ExecutionRuleOr();

        Filter falseFilter = mock(Filter.class);
        when(falseFilter.check(update)).thenReturn(false);

        ruleOr.setFilters(Arrays.asList(falseFilter));

        Assert.assertFalse(ruleOr.execute(update));
    }

    @Test
    public void testOrTrueFalse() {
        Update update = mock(Update.class);
        ExecutionRuleOr ruleOr = new ExecutionRuleOr();

        Filter trueFilter = mock(Filter.class);
        when(trueFilter.check(update)).thenReturn(true);

        Filter falseFilter = mock(Filter.class);
        when(falseFilter.check(update)).thenReturn(false);

        ruleOr.setFilters(Arrays.asList(trueFilter, falseFilter));

        Assert.assertTrue(ruleOr.execute(update));
    }

}
