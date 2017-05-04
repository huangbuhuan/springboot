package me.buhuan.mybatis.controller;

import me.buhuan.mybatis.pojo.UserDO;
import me.buhuan.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午3:24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/v1/{id}", method = RequestMethod.GET)
    public UserDO getById(@PathVariable("id") String id) {
        return userService.getById(id);
    }

}
