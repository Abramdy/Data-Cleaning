package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 */
public enum StrategyKeyType {
    ;

    private int id;
    private String code;
    private String description;

    StrategyKeyType(int id, String code, String description) {
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