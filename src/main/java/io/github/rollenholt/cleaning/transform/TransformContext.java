package io.github.rollenholt.cleaning.transform;

import io.github.rollenholt.cleaning.common.StrategyContext;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * rollenholt
 * 2015/6/14.
 */
@Service
public abstract class TransformContext extends StrategyContext<Transform>{

    protected abstract Map<String, Transform> getContext();

}
