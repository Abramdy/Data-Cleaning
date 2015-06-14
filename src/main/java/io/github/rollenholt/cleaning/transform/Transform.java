package io.github.rollenholt.cleaning.transform;
import io.github.rollenholt.cleaning.common.Strategy;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import io.github.rollenholt.cleaning.pojo.TransformedPayload;

/**
 * rollenholt
 * 2015/6/14.
 */
public abstract class Transform implements Strategy {

    protected abstract <T1 extends OriginalPayload, T2 extends TransformedPayload> T2 applyTransform(T1 t1);

}
