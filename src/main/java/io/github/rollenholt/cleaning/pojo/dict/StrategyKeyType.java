package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 *
 * <p>
 *     ���������ʶ�����������{@code DataType}һ��ʹ�á�
 *
 *     ��{@code DataType}�������ǣ�dayaType���ܾ�ֻ����ô����������ͬһ��
 *     dataTyped���͵����ݵ��ǻ���������ά�������֡�������������Ϊ�����������ͣ�
 *     ���Ƕ����������������ֻᰴ�ղ�ͬ�Ĳ��������֡�
 *
 *     Ϊ�˽�DataType֮�������ά�����г�������ṩ�����StrategyKeyType����
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
