package io.github.rollenholt.cleaning.common;

import io.github.rollenholt.cleaning.pojo.OriginalPayload;

/**
 * rollenholt
 * 2015/6/14.
 */
public interface StrategyKeyGenerator<T extends OriginalPayload> {

    String generateKey(T t);
}
