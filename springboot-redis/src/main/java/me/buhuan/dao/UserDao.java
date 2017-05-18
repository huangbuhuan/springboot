package me.buhuan.dao;

import me.buhuan.pojo.UserDO;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/5下午3:59
 */
public interface UserDao {
    UserDO getById(String id);
}
