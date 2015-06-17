package dao;


import model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUserList();

    User getUserByName(String userName);
}