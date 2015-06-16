package io.github.rollenholt.cleaning.pojo.dict;

/**
 * rollenholt
 * 2015/6/16.
 */
public enum HandleResultType {
    SUCCESS(1, "success", "�����ݴ���ɹ��Ժ�Ż���ΪSUCCESS״̬"),
    FAILD(2, "faild", "��ʼ�������ݴ���ʧ�ܵ�ʱ����ΪFAILD"),
    TIMEOUT(3, "time out", "��rpc������ó�ʱ��ʱ����ΪTIMEOUT");

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
