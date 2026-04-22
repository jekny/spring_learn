package com.hyw.mytest;

import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/22 18:55
 * @Version 1.0
 */
@Controller
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void controllerGerService(){
        userService.getDaoService();
    }
}
