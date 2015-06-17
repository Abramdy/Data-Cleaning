package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 *
 * <p>
 *     数据种类标识，往往都会和{@code DataType}一起使用。
 *
 *     和{@code DataType}的区别是，dayaType可能就只有那么几个，但是同一个
 *     dataTyped类型的数据但是还有其他的维度来区分。比如数据类型为订单数据类型，
 *     但是订单数据类型往往又会按照不同的部门来划分。
 *
 *     为了将DataType之外的数据维护进行抽象，因此提供了这个StrategyKeyType定义
 * </p>
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
