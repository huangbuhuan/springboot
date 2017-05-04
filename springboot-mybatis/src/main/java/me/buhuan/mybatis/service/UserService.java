package me.buhuan.mybatis.service;

import me.buhuan.mybatis.pojo.UserDO;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午3:23
 */
public interface UserService {

    UserDO getById(String id);
}
