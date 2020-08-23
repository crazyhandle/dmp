package cn.qf.b2c.gciantispider.dao.impl;

import java.util.List;

import cn.qf.b2c.gciantispider.model.User;
import org.springframework.stereotype.Repository;

import cn.qf.b2c.gciantispider.dao.IUserDao;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

    @Override
    public List<User> queryUserInfo(String id) {
        List<User> users  = super.find(id);
        return users;
    }

}
