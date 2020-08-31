package com.michmi.test;

import com.michmi.dao.UserDao;
import com.michmi.dao.impl.UserDaoImpl;
import com.michmi.domain.User;
import org.junit.Test;

import java.util.List;

public class TestUserDaoImpl
{
    @Test
    public void DaoImplTest()
    {
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();

        for (User user :
                users)
        {
            System.out.println(user);
        }
    }
}
