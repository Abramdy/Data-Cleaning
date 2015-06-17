package io.github.rollenholt.cleaning.collect;

import com.google.common.base.Preconditions;
import io.github.rollenholt.cleaning.pojo.DataWashParam;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * rollenholt
 * 2015/6/14.
 */
@Component
public class DataCollertorComponent {

    @Resource
    private CollectorContext collectorContext;

    @Resource
    private CollectorStrategyGenerator collectorStrategyGenerator;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public List<OriginalPayload> collect(DataWashParam obj){
        Preconditions.checkNotNull(obj);

        logger.debug("start to collect data");

        String key = collectorStrategyGenerator.generateKey(obj);
        Collector collector = collectorContext.fetch(key);

        Preconditions.checkNotNull(collector);

        logger.debug("data collect has finished");
        return  collector.collect();
    }


}
