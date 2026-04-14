package com.hyw.mytest.bean.service;

import java.util.Set;

/**
 * ClassName: SetService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 21:22
 * @Version 1.0
 */
public class SetService {
    Set<String> sets;

    @Override
    public String toString() {
        return "SetService{" +
                "sets=" + sets +
                '}';
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
}
