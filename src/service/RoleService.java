package service;

import dao.RoleMapper;
import dao.UserMapper;
import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService
{
    @Autowired
    RoleMapper roleMapper;

    public Role getRoleById(Integer id)
    {
        return roleMapper.selectByPrimaryKey(id);
    }

    public List<Role> getAllRoleList()
    {
        return roleMapper.getAllRoleList();
    }
}
