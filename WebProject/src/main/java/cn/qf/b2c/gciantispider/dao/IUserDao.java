package cn.qf.b2c.gciantispider.dao;

import cn.qf.b2c.gciantispider.model.User;

import java.util.List;

public interface IUserDao extends IBaseDao<User>{
  
    public List<User> queryUserInfo(String id);
}