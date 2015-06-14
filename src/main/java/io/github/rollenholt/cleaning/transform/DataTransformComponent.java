package io.github.rollenholt.cleaning.transform;

import com.google.common.collect.Lists;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import io.github.rollenholt.cleaning.pojo.TransformedPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

/**
 * rollenholt
 * 2015/6/14.
 */
@Component
public class DataTransformComponent {

    @Resource
    TransformContext transformContext;

    @Resource
    private TransformStrategyKeyGenerator transformStrategyKeyGenerator;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public <T1 extends OriginalPayload, T2 extends TransformedPayload> List<T2> transform(List<T1> toBeTransformedList){
        logger.debug("start to transform...");

        if(isEmpty(toBeTransformedList)){
            return Collections.emptyList();
        }

        List<T2> transformedList = Lists.newArrayList();
        for (T1 t1 : toBeTransformedList) {
            String key = transformStrategyKeyGenerator.generateKey(t1);
            Transform transform = transformContext.fetch(key);
            T2 transformedPayload = transform.applyTransform(t1);
            transformedList.add(transformedPayload);
        }
        logger.debug("transform has finished...");
        return transformedList;
    }


}
