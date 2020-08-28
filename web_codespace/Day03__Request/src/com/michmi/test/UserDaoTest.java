package com.michmi.test;

import com.michmi.dao.impl.UserDaoImpl;
import com.michmi.domain.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoTest
{
    @Test
    public void test() throws SQLException
    {
        User loginUser = new User();
        loginUser.setUsername("liuyi");
        loginUser.setPassword("123456");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
