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

    public List<String> getUserRolesByUserId(int userId)
    {
        return userMapper.getUserRolesByUserId(userId);
    }


    public void deleteUserByUserId(Integer userid)
    {
        userMapper.deleteByPrimaryKey(userid);
    }

    public void addUser(User user)
    {

        userMapper.insertSelective(user);
    }

    public void upDateUserById(User user)
    {
        userMapper.updateByPrimaryKey(user);
    }


    public boolean checkIsExistByName(String name)
    {
        User user = userMapper.getUserByName(name);
        if (user == null)
        {
            return false;
        } else
        {
            return true;
        }
    }
}
