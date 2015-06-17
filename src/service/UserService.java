package service;

import dao.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserMapper userMapper;

    public User getUserById(Integer id)
    {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> getAllUserList()
    {
        return userMapper.getAllUserList();
    }
}
