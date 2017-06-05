package me.buhuan.controller;

import me.buhuan.domain.User;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0.0
 * @since 2017/5/23下午4:54
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public User findUser() {
        return userService.test();
    }
}
