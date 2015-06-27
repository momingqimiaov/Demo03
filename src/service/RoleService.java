package service;

import dao.RoleMapper;
import model.Role;
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

    public List<String> getAllRoleNameList()
    {
        return roleMapper.getAllRoleNameList();
    }

    public void addRole(Role role)
    {
        roleMapper.insertSelective(role);
    }

    public void deleteRoleById(Integer id)
    {
        roleMapper.deleteByPrimaryKey(id);
    }

    public void upDateRoleById(Role role)
    {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    public int getIdByRoleName(String role)
    {
        return roleMapper.getIdByRoleName(role);
    }

    public boolean checkIsExistByName(String rolename)
    {
        Role role = roleMapper.getRoleByName(rolename);
        if (role == null)
        {
            return false;
        } else
        {
            return true;
        }

    }
}
