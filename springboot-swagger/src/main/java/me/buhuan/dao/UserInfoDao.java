package me.buhuan.dao;

import me.buhuan.domain.UserInfo;

import java.util.List;

/**
 * @version 1.0.0
 * @since 2017/5/18下午11:39
 */
public interface UserInfoDao {

    UserInfo findOne(String id);

    UserInfo save(UserInfo userInfo);

    UserInfo update(String id, UserInfo userInfo);

    List<UserInfo> findAll();

    void delete(String id);
}
