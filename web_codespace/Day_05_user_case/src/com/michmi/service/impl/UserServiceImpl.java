package com.michmi.service.impl;

import com.michmi.dao.UserDao;
import com.michmi.dao.impl.UserDaoImpl;
import com.michmi.domain.User;
import com.michmi.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll()
    {
        //调用dao
        return dao.findAll();
    }
}
