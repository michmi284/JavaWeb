package remake.dao;

import remake.domain.User;

import java.util.List;

public interface UserDao
{
    public List<User> findAll();
}
