package io.github.rollenholt.cleaning.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * rollenholt
 * 2015/6/15.
 */
public class DataWashParam implements Serializable {

    /**
     * ��������id
     */
    private int dataTypeId;

    /**
     * �������ദ��ʽ����id
     */
    private int strategyKeyTypeId;


    public int getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(int dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public int getStrategyKeyTypeId() {
        return strategyKeyTypeId;
    }

    public void setStrategyKeyTypeId(int strategyKeyTypeId) {
        this.strategyKeyTypeId = strategyKeyTypeId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
