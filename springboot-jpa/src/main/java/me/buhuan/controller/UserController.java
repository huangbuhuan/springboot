package me.buhuan.controller;

import me.buhuan.pojo.UserDO;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/5下午1:56
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/v1/{id}", method = RequestMethod.GET)
    public UserDO getById(@PathVariable("id") String id) {
        return userService.getById(id);
    }
}
