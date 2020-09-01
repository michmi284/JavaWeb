package com.michmi.service;

import com.michmi.domain.User;

import java.util.List;

/**
 * 用户管理业务接口
 */

public interface UserService
{
    //查询所有用户信息
    public List<User> findAll();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(String id);

    User findUserById(String id);

    public User login(User user);

}
