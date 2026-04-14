package com.hyw.mytest.bean.service;

import java.util.Properties;

/**
 * ClassName: PropertiesService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 21:58
 * @Version 1.0
 */
public class PropertiesService {
    Properties properties;

    @Override
    public String toString() {
        return "PropertiesService{" +
                "properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
