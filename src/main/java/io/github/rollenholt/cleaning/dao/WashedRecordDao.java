package io.github.rollenholt.cleaning.dao;

import io.github.rollenholt.cleaning.pojo.model.WashedRecord;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * rollenholt
 * 2015/6/15.
 */
@Repository
public class WashedRecordDao {

    /**
     * @return  db effect rows count
     */
    public int record(WashedRecord washedRecord) {
        return 0;
    }

    public List<WashedRecord> queryAll(RowBounds rowBounds) {
        return Collections.emptyList();
    }

    /**
     * @return 返回受影响的行数
     */
    public int updateWhenWashSuccessByOriginDataIdAndType(WashedRecord washedRecord) {
        return 0;
    }
}
