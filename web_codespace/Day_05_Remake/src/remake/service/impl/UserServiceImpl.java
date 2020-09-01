package remake.service.impl;

import remake.dao.UserDao;
import remake.dao.impl.UserDaoImpl;
import remake.domain.User;
import remake.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll()
    {
        return findAll();
    }
}
