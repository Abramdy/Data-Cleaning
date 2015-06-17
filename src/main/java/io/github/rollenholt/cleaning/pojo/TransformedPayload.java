package io.github.rollenholt.cleaning.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * rollenholt
 * 2015/6/14.
 * 转换之后的数据负载
 */
public class TransformedPayload implements Serializable {

    /**
     * 原始的数据id
     */
    private Integer originDataId;

    /**
     * 数据类型id
     */
    private Integer dataTypeId;

    public Integer getOriginDataId() {
        return originDataId;
    }

    public void setOriginDataId(Integer originDataId) {
        this.originDataId = originDataId;
    }

    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
