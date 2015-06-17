package io.github.rollenholt.cleaning.service;

import io.github.rollenholt.cleaning.dao.WashedRecordDao;
import io.github.rollenholt.cleaning.pojo.model.WashedRecord;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * rollenholt
 * 2015/6/15.
 */
@Service
public class WashedRecordService {

    private WashedRecordDao washedRecordDao;

    /**
     * ����������ϴ��¼
     */
    public int recoed( WashedRecord washedRecord){
        checkNotNull(washedRecord);
        return washedRecordDao.record(washedRecord);
    }

    /**
     * ��ѯwashedRecord���еļ�¼
     */
    public List<WashedRecord> queryAll(RowBounds rowBounds){
        checkNotNull(rowBounds);
        return washedRecordDao.queryAll(rowBounds);
    }


    /**
     * ����ԭʼ������id����������������washedRecord���еļ�¼
     * @return ������Ӱ�������
     */
    public int updateWhenWashSuccessByOriginDataIdAndType(WashedRecord washedRecord) {
        checkNotNull(washedRecord);
        Integer dataTypeId = washedRecord.getDataTypeId();
        Integer originDataId = washedRecord.getOriginDataId();
        checkNotNull(dataTypeId);
        checkNotNull(originDataId);
        return washedRecordDao.updateWhenWashSuccessByOriginDataIdAndType(washedRecord);
    }
}
