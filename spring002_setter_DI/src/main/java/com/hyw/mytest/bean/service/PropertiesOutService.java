package com.hyw.mytest.bean.service;

/**
 * ClassName: PropertiesOutService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/15 18:09
 * @Version 1.0
 */
public class PropertiesOutService {
    String driver;
    String url;
    String user;
    String password;

    @Override
    public String toString() {
        return "PropertiesOutService{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
