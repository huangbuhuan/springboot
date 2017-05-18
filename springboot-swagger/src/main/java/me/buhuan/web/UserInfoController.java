package me.buhuan.web;

import me.buhuan.domain.UserInfo;
import me.buhuan.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0.0
 * @since 2017/5/18下午11:49
 */
@RestController
@RequestMapping("/api")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserInfo> findAll() {
        return userInfoService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserInfo findOne(@PathVariable("id") String id) {
        return userInfoService.findOne(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UserInfo createUserInfo(UserInfo userInfo) {
        return userInfoService.save(userInfo);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public UserInfo updateUserInfo(@PathVariable("id") String id, UserInfo userInfo) {
        return userInfoService.update(id, userInfo);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        userInfoService.delete(id);
    }
}
