package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 */
public enum HandleResultType {
    SUCCESS(1, "success", "当数据处理成功以后才会标记为SUCCESS状态"),
    FAILD(2, "faild", "初始或者数据处理失败的时候标记为FAILD"),
    TIMEOUT(3, "time out", "当rpc服务调用超时的时候标记为TIMEOUT");

    private int id;
    private String code;
    private String description;

    HandleResultType(int id, String code, String description) {
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
