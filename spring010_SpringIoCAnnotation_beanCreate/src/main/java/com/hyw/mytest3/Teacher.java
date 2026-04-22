package com.hyw.mytest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * ClassName: Teacher
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 7:26
 * @Version 1.0
 */
@Component
public class Teacher {
    private User user;
    private User2 user2;

    @Override
    public String toString() {
        return "Teacher{" +
                "user=" + user +
                ", user2=" + user2 +
                '}';
    }

    @Autowired
    public Teacher(@Qualifier("user01") User user, @Qualifier("user02") User2 user2) {
        this.user = user;
        this.user2 = user2;
    }
}
