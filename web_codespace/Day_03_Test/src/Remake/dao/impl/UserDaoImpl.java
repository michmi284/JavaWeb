package Remake.dao.impl;

import Remake.dao.UserDao;
import Remake.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao
{
    private Connection conn=null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private User user = null;
    @Override
    public User login(User loginUser)
    {
        return null;
    }
}
