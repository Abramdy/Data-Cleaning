package io.github.rollenholt.cleaning.collect;

import io.github.rollenholt.cleaning.common.StrategyContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * rollenholt
 * 2015/6/15.
 */
@Component
public abstract class CollectorContext extends StrategyContext<Collector> {

    protected abstract Map<String, Collector> getContext();

}
