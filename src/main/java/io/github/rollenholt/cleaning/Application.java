package io.github.rollenholt.cleaning;

import io.github.rollenholt.cleaning.controller.DataCleaningMonitorController;
import io.github.rollenholt.cleaning.controller.DataCleaningTriggerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * rollenholt
 * 2015/6/16.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Object[] objects = {DataCleaningTriggerController.class, DataCleaningMonitorController.class};
        SpringApplication.run(objects, args);
    }

}
