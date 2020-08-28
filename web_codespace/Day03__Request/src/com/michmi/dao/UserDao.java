package com.michmi.dao;

import com.michmi.domain.User;

import java.sql.SQLException;

public interface UserDao
{
    public User login(User loginUser) throws SQLException;
}
