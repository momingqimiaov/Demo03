package service;

import dao.User_RoleMapper;
import model.UserRoleRole;
import model.User_Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ChenShang on 2015/6/20 0020.
 */
@Service
public class User_RoleService
{
    @Autowired
    User_RoleMapper user_roleMapper;

    public void deleteUserRoleByUserId(Integer userId)
    {
        user_roleMapper.deleteUserRoleByUserId(userId);
    }

    public List<String> getRoleNameByUserId(Integer userId)
    {
        return user_roleMapper.getRoleNameByUserId(userId);
    }

    public List<String> getUserRoleByRoleName(String rolename)
    {
        return user_roleMapper.getUserRoleByRoleName(rolename);
    }


    public void deleteUserByRoleName(String userRloe)
    {
        user_roleMapper.deleteUserByRoleName(userRloe);
    }

    public void upDateRoleNameByRoleId(UserRoleRole userRoleRole)
    {
        user_roleMapper.upDateRoleNameByRoleId(userRoleRole);
    }

    public void addUserRole(User_Role user_role)
    {
        user_roleMapper.insertSelective(user_role);
    }

    public void deleteUserRole(User_Role user_role)
    {
        user_roleMapper.deleteUserRole(user_role);

    }
}
