package com.hyw.mytest.bean;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: Car
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 18:22
 * @Version 1.0
 */
public class Car {
    private static Logger logger=  LoggerFactory.getLogger(Car.class);

    public void getLog(){
        logger.info("日志:");
    }
}
