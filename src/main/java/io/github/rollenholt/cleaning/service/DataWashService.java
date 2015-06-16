package io.github.rollenholt.cleaning.service;

import io.github.rollenholt.cleaning.collect.DataCollertorComponent;
import io.github.rollenholt.cleaning.pojo.DataCollectorParam;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import io.github.rollenholt.cleaning.pojo.TransformedPayload;
import io.github.rollenholt.cleaning.pojo.model.WashedRecord;
import io.github.rollenholt.cleaning.transform.TransformComponent;
import io.github.rollenholt.cleaning.wash.WashComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static io.github.rollenholt.cleaning.pojo.dict.HandleResultType.FAILD;
import static io.github.rollenholt.cleaning.pojo.dict.HandleResultType.SUCCESS;

/**
 * rollenholt
 * 2015/6/16.
 */
@Service
public class DataWashService {

    @Resource
    private DataCollertorComponent collertorComponent;

    @Resource
    private TransformComponent transformComponent;

    @Resource
    private WashComponent washComponent;

    @Resource
    private WashedRecordService washedRecordService;

    public static final int DEFAULT_WASHED_DATA_ID = 0;

    private final Logger logger = LoggerFactory.getLogger(DataWashService.class);

    public void washData(){

        // create DataCollectorParam instance and then do some properties init
        DataCollectorParam dataCollectorParam = fetchDataCollectorParam();

        // start to collect data
        List<OriginalPayload> originalPayloadList = collertorComponent.collect(dataCollectorParam);

        // start to transform data
        List<TransformedPayload> transformedPayloadList = transformComponent.transform(originalPayloadList);

        // start data wash
        for (TransformedPayload transformedPayload : transformedPayloadList) {
            initWashedRecord(dataCollectorParam, transformedPayload);

            final Integer dataTypeId = transformedPayload.getDataTypeId();
            final Integer originDataId = transformedPayload.getOriginDataId();
            int washDataId = DEFAULT_WASHED_DATA_ID;
            try {
                washDataId = washComponent.wash(transformedPayload);
            } catch (Exception e) {
                logger.error("wash data [originalDataId: {}, dataTypeId: {}] throw exception",
                        originDataId, dataTypeId, e.getMessage(), e);
            }

            // FIXME modify to batch update
            updateWashedRecordWhenWashSuccessByOriginDataIdAndType(dataTypeId, originDataId, washDataId);
        }

    }

    private DataCollectorParam fetchDataCollectorParam() {
        //create DataCollectorParam instance and then do some properties init
        DataCollectorParam dataCollectorParam = new DataCollectorParam();
        dataCollectorParam.setDataTypeId(0);
        dataCollectorParam.setStrategyKeyTypeId(0);
        return dataCollectorParam;
    }

    private void updateWashedRecordWhenWashSuccessByOriginDataIdAndType(Integer dataTypeId, Integer originDataId, int washDataId) {
        WashedRecord washedRecord = new WashedRecord();
        washedRecord.setDataTypeId(dataTypeId);
        washedRecord.setOriginDataId(originDataId);
        washedRecord.setHandleResultTypeId(SUCCESS.getId());
        washedRecord.setWashedDataId(washDataId);
        washedRecordService.updateWhenWashSuccessByOriginDataIdAndType(washedRecord);
    }

    private void initWashedRecord(DataCollectorParam dataCollectorParam, TransformedPayload transformedPayload) {
        WashedRecord washedRecord = new WashedRecord();
        washedRecord.setDataTypeId(dataCollectorParam.getDataTypeId());
        washedRecord.setStrategykeyTypeId(dataCollectorParam.getStrategyKeyTypeId());
        washedRecord.setHandleResultTypeId(FAILD.getId());
        washedRecord.setOriginDataId(transformedPayload.getOriginDataId());
        washedRecord.setDataTypeId(transformedPayload.getDataTypeId());
        washedRecord.setWashedDataId(DEFAULT_WASHED_DATA_ID);
        washedRecordService.recoed(washedRecord);
    }

}
