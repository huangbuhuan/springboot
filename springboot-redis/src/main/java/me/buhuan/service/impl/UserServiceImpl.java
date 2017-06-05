package me.buhuan.service.impl;

import me.buhuan.domain.User;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @since 2017/5/23下午4:55
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private RedisTemplate<String, User> redisTemplate;

    @Override
    public User test() {
        ValueOperations<String, User>  operations = redisTemplate.opsForValue();
        operations.set("user",   new User("1", "xm"));
        return operations.get("user");
    }

}
