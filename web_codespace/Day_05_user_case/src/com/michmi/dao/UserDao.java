package com.michmi.dao;

import com.michmi.domain.User;

import java.util.List;

public interface UserDao
{
    //用户操作dao
    public List<User> findAll();
}
