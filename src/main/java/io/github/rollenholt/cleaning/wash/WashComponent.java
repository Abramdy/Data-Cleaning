package io.github.rollenholt.cleaning.wash;

import io.github.rollenholt.cleaning.pojo.TransformedPayload;
import org.springframework.stereotype.Component;

/**
 * rollenholt
 * 2015/6/16.
 */
@Component
public class WashComponent {

    /**
     * 对转换之后的数据进行具体的清洗工作
     * <p>
     *     这些清洗工作需要根据具体的业务场景来完成，
     *     返回结果返回的是主记录的主键id，而不是附属
     *     于主记录的从记录的主键id
     * </p>
     * @param transformedPayload 转换之后的数据
     * @return 返回清洗后数据的主键id
     */
    public int wash(TransformedPayload transformedPayload) {
        // some business logic related wash code
        return 0;
    }
}
