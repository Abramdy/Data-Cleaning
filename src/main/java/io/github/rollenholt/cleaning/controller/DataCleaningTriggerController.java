package io.github.rollenholt.cleaning.controller;

import com.rollenholt.pear.pojo.JsonV2;
import io.github.rollenholt.cleaning.collect.DataCollertorComponent;
import io.github.rollenholt.cleaning.pojo.DataCollectorParam;
import io.github.rollenholt.cleaning.pojo.OriginalPayload;
import io.github.rollenholt.cleaning.pojo.TransformedPayload;
import io.github.rollenholt.cleaning.transform.DataTransformComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * rollenholt
 * 2015/6/14.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/data/cleaning")
public class DataCleaningTriggerController {

    @Resource
    private DataCollertorComponent collertorComponent;

    @Resource
    private DataTransformComponent dataTransformComponent;

    @RequestMapping(value ="/trigger", method = RequestMethod.GET)
    @ResponseBody
    public JsonV2 trigger(){

        DataCollectorParam dataCollectorParam = new DataCollectorParam();
        List<OriginalPayload> originalPayloadList = collertorComponent.collect(dataCollectorParam);

        List<TransformedPayload> transformedPayloadList = dataTransformComponent.transform(originalPayloadList);

        // todo
        return new JsonV2(0, "", null );
    }

    public static void main(String[] args) {
        SpringApplication.run(DataCleaningTriggerController.class, args);
    }
}
