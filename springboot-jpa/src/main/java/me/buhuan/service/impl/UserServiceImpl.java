package me.buhuan.service.impl;

import me.buhuan.dao.UserRepository;
import me.buhuan.pojo.UserDO;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/5下午1:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDO getById(String id) {
        return userRepository.findOne(id);
    }

}
