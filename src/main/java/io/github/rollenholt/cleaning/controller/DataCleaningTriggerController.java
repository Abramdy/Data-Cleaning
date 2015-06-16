package io.github.rollenholt.cleaning.controller;

import com.rollenholt.pear.pojo.JsonV2;
import io.github.rollenholt.cleaning.service.DataWashService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * rollenholt
 * 2015/6/14.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/data/cleaning")
public class DataCleaningTriggerController {

    @Resource
    private DataWashService dataWashService;

    private final Logger logger = LoggerFactory.getLogger(DataCleaningTriggerController.class);

    @RequestMapping(value ="/trigger", method = RequestMethod.GET)
    @ResponseBody
    public JsonV2 trigger(){
        logger.info("start to trigger data wash task");
        dataWashService.washData();
        logger.info("finished data wash tasl");
        return new JsonV2<String>(0, "data wash finished", null);
    }

}
