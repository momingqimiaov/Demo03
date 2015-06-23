package dao;


import model.UserRoleRole;
import model.User_Role;
import org.springframework.stereotype.Component;

import java.util.List;

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

    List<String> getRoleNameByUserId(Integer id);

    List<String> getUserRoleByRoleName(String userRloe);

    void deleteUserByRoleName(String userRloe);

    void upDateRoleNameByRoleId(UserRoleRole userRoleRole);
}