package com.michmi.dao.impl;

import com.michmi.dao.UserDao;
import com.michmi.domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.michmi.util.JDBCUtils;

import java.util.List;

public class UserDaoImpl implements UserDao
{
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll()
    {
        String sql = "select * from user";

        return template.query(sql, new BeanPropertyRowMapper<User>(User.class));

    }

    @Override
    public void add(User user)
    {
        String sql = "insert into user values(null,?,?,?,?,?,?,null,null)";
        int i = template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
        System.out.println(i);
    }

    @Override
    public void update(User user)
    {
        String sql = "update user set gender=?,age=?,address=?,qq=?,email=? where id=?";
        template.update(sql, user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());

    }

    @Override
    public User findById(int id)
    {
        String sql = "select * from user where id =?";

        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }


    @Override
    public void delete(int id)
    {
        String sql = "delete from user where id=?";
        template.update(sql, id);


    }

    @Override
    public User findUserByUserNameAndPassword(String username, String password)
    {
        try
        {
            String sql = "select * from user where username = ? and password = ?";

            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (DataAccessException e)
        {
            e.printStackTrace();
            return null;
        }
    }


}
