package io.github.rollenholt.cleaning.pojo.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * rollenholt
 * 2015/6/15.
 */
public class WashedRecord implements Serializable{

    private Integer id;

    private Integer originDataId;

    private Integer washedDataId;

    private Integer dataTypeId;

    private Integer handleResultTypeId;

    private Integer strategykeyTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOriginDataId() {
        return originDataId;
    }

    public void setOriginDataId(Integer originDataId) {
        this.originDataId = originDataId;
    }

    public Integer getWashedDataId() {
        return washedDataId;
    }

    public void setWashedDataId(Integer washedDataId) {
        this.washedDataId = washedDataId;
    }

    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public Integer getHandleResultTypeId() {
        return handleResultTypeId;
    }

    public void setHandleResultTypeId(Integer handleResultTypeId) {
        this.handleResultTypeId = handleResultTypeId;
    }

    public Integer getStrategykeyTypeId() {
        return strategykeyTypeId;
    }

    public void setStrategykeyTypeId(Integer strategykeyTypeId) {
        this.strategykeyTypeId = strategykeyTypeId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
