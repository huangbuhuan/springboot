package me.buhuan.mybatis.service.impl;

import me.buhuan.mybatis.dao.UserDao;
import me.buhuan.mybatis.pojo.UserDO;
import me.buhuan.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午3:23
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public UserDO getById(String id) {
        return userDao.getById(id);
    }

}
