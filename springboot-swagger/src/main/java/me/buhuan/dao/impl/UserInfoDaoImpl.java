package me.buhuan.dao.impl;

import me.buhuan.dao.UserInfoDao;
import me.buhuan.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0.0
 * @since 2017/5/18下午11:39
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao{

    private final Map<String, UserInfo> userInfoMap = new ConcurrentHashMap<>();

    @Override
    public UserInfo findOne(String id) {
        return userInfoMap.get(id);
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfoMap.put(userInfo.getId(), userInfo);
    }

    @Override
    public UserInfo update(String id, UserInfo userInfo) {
        return userInfoMap.put(id, userInfo);
    }

    @Override
    public List<UserInfo> findAll() {
        return (List<UserInfo>) userInfoMap.values();
    }

    @Override
    public void delete(String id) {
        userInfoMap.remove(id);
    }
}
