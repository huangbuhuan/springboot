package me.buhuan.dao;

import me.buhuan.pojo.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/5下午12:02
 */
@Repository
public interface UserRepository extends JpaRepository<UserDO, String> {

}
