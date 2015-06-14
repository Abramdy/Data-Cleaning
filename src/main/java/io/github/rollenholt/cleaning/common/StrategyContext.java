package io.github.rollenholt.cleaning.common;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * rollenholt
 * 2015/6/14.
 */
@Component
public abstract class StrategyContext<T extends Strategy> {

    protected abstract Map<String, T> getContext();

    public T fetch(String strategyKey){
        Preconditions.checkArgument(!Strings.isNullOrEmpty(strategyKey));

        Map<String, T> context = getContext();
        T strategy = context.get(strategyKey);
        Preconditions.checkNotNull(strategy, "can not fetch strategy for input key: " + strategyKey);
        return strategy;
    }

}
