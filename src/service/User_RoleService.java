package service;

import dao.User_RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
