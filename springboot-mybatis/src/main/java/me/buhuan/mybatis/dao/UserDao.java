package me.buhuan.mybatis.dao;

import me.buhuan.mybatis.pojo.UserDO;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午2:03
 */
public interface UserDao {

    UserDO getById(String id);
}
