package io.github.rollenholt.cleaning.service;

import com.google.common.base.Preconditions;
import io.github.rollenholt.cleaning.dao.WashedRecordDao;
import io.github.rollenholt.cleaning.pojo.model.WashedRecord;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * rollenholt
 * 2015/6/15.
 */
@Service
public class WashedRecordService {

    private WashedRecordDao washedRecordDao;

    public int recoed( WashedRecord washedRecord){
        Preconditions.checkNotNull(washedRecord);
        return washedRecordDao.record(washedRecord);
    }

    public List<WashedRecord> queryAll(RowBounds rowBounds){
        Preconditions.checkNotNull(rowBounds);
        return washedRecordDao.queryAll(rowBounds);
    }


    public void updateWhenWashSuccessByOriginDataIdAndType(WashedRecord washedRecord) {

    }
}
