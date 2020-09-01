package com.michmi.test;

import com.michmi.dao.UserDao;
import com.michmi.dao.impl.UserDaoImpl;
import com.michmi.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
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

    @Test
    public void test2()
    {
        User user = new User();
        user.setName("LY");
        user.setGender("男");
        user.setAge(22);
        user.setAddress("彰武");
        user.setQq("12345");
        user.setEmail("12345@qq.com");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }

    @Test
    public void test3()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "KDY");
        map.put("gender", "男");
        map.put("age", "22");
        map.put("address", "丹东");
        map.put("qq", "23456");
        map.put("email", "23456@qq.com");
        User user = new User();
        try
        {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        System.out.println(user);
    }

    @Test
    public void test4()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("gender", "男");
        map.put("age", "22");
        map.put("address", "丹东");
        map.put("qq", "23456");
        map.put("email", "23456@qq.com");
        map.put("id","15");
        User user = new User();
        try
        {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
