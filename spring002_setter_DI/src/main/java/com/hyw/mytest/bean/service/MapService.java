package com.hyw.mytest.bean.service;

import java.util.Map;

/**
 * ClassName: MapService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 21:25
 * @Version 1.0
 */
public class MapService {
    Map<String,String> maps;

    @Override
    public String toString() {
        return "MapService{" +
                "maps=" + maps +
                '}';
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
