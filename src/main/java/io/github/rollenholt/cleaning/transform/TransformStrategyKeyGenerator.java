package io.github.rollenholt.cleaning.transform;

import io.github.rollenholt.cleaning.common.StrategyKeyGenerator;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import org.springframework.stereotype.Service;

/**
 * rollenholt
 * 2015/6/14.
 */
@Service
public class TransformStrategyKeyGenerator implements StrategyKeyGenerator {

    public String generateKey(OriginalPayload originalPayload){
        //todo
        return "";
    }

}
