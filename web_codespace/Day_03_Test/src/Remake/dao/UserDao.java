package Remake.dao;

import Remake.domain.User;

import java.sql.SQLException;

public interface UserDao
{
    public User login(User loginUser) throws SQLException;
}
