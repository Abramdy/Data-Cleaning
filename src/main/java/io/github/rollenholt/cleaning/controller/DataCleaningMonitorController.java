package io.github.rollenholt.cleaning.controller;

import com.rollenholt.pear.pojo.JsonV2;
import io.github.rollenholt.cleaning.pojo.model.WashedRecord;
import io.github.rollenholt.cleaning.service.WashedRecordService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * rollenholt
 * 2015/6/16.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/data/cleaning")
public class DataCleaningMonitorController {

    @Resource
    private WashedRecordService washedRecordService;

    @RequestMapping(value = "/monitor", method = RequestMethod.GET)
    @ResponseBody
    public JsonV2 monitor(@RequestParam("limit")int limit, @RequestParam("offset")int offset){
        List<WashedRecord> washedRecords = washedRecordService.queryAll(new RowBounds(limit, offset));
        return new JsonV2<List<WashedRecord>>(0, "", washedRecords);
    }

}
