package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 * 被清洗的数据类型，此处需要更新具体的实际情况来定义
 */
public enum DataType {
    ;

    private int id;
    private String code;
    private String description;

    DataType(int id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
