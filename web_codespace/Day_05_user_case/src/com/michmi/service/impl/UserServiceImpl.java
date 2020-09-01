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

    @Override
    public void addUser(User user)
    {
        //添加用户
        dao.add(user);
    }

    @Override
    public void updateUser(User user)
    {
        dao.update(user);
    }

    @Override
    public void deleteUser(String id)
    {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id)
    {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public User login(User user)
    {
        return dao.findUserByUserNameAndPassword(user.getUsername(),user.getPassword());
    }
}
