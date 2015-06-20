package dao;


import model.User_Role;
import org.springframework.stereotype.Component;

@Component
public interface User_RoleMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(User_Role record);

    int insertSelective(User_Role record);

    User_Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Role record);

    int updateByPrimaryKey(User_Role record);

    void deleteUserRoleByUserId(Integer userId);
}