package com.michmi.service;


import com.michmi.domain.PageBean;
import com.michmi.domain.User;

import java.util.List;
import java.util.Map;



public interface UserService {
    // 查询所有用户信息
    public List<User> findAll();


    void addUser(User user);

    void update(User user);

    void deleteUser(String id);

    User findUserById(String id);

    User login(User user);

    void deleteSelectedUser(String[] ids);

    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition);

}
