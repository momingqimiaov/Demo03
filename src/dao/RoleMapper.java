package dao;


import model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getAllRoleList();

    List<String> getAllRoleNameList();
}