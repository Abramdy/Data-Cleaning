package io.github.rollenholt.cleaning.controller;

import com.rollenholt.pear.pojo.JsonV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * rollenholt
 * 2015/6/14.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/data/cleaning")
public class DataCleaningController {

    @RequestMapping(value ="/start", method = RequestMethod.GET)
    @ResponseBody
    public JsonV2 startDataCleaning(){
        return new JsonV2(0, "", null );
    }

    public static void main(String[] args) {
        SpringApplication.run(DataCleaningController.class, args);
    }
}
