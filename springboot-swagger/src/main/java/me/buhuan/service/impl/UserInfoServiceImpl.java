package me.buhuan.service.impl;

import me.buhuan.dao.UserInfoDao;
import me.buhuan.domain.UserInfo;
import me.buhuan.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @since 2017/5/18下午11:38
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findOne(String id) {
        return userInfoDao.findOne(id);
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfoDao.save(userInfo);
    }

    @Override
    public UserInfo update(String id, UserInfo userInfo) {
        return userInfoDao.update(id, userInfo);
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public void delete(String id) {
        userInfoDao.delete(id);
    }
}
