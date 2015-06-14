package io.github.rollenholt.cleaning.collect;

import io.github.rollenholt.cleaning.common.Strategy;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * rollenholt
 * 2015/6/14.
 */
@Component
public abstract class Collector implements Strategy {

    public  abstract <T extends OriginalPayload> List<T> collect();
}
