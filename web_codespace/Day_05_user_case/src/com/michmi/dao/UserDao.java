package com.michmi.dao;

import com.michmi.domain.User;

import java.util.List;

public interface UserDao
{
    //用户操作dao
    public List<User> findAll();

    void add(User user);

    void update(User user);

    User findById(int id);

    void delete(int id);

    public User findUserByUserNameAndPassword(String username, String password);
}
