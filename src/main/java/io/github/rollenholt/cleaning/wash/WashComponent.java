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
     * ��ת��֮������ݽ��о������ϴ����
     * <p>
     *     ��Щ��ϴ������Ҫ���ݾ����ҵ�񳡾�����ɣ�
     *     ���ؽ�����ص�������¼������id�������Ǹ���
     *     ������¼�ĴӼ�¼������id
     * </p>
     * @param transformedPayload ת��֮�������
     * @return ������ϴ�����ݵ�����id
     */
    public int wash(TransformedPayload transformedPayload) {
        // some business logic related wash code
        return 0;
    }
}
