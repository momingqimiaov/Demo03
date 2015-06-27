package dao;


import model.UserSecurity;
import model.User_Security;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface User_SecurityMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(User_Security record);

    int insertSelective(User_Security record);

    User_Security selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Security record);

    int updateByPrimaryKey(User_Security record);

    void deletUserSecurityByUserId(Integer userId);

    List<String> getSecurityNameByUserId(Integer id);

    List<String> getUserSecurityBySecurityID(Integer securityId);

    void deletUserSecurityBySecurityID(Integer securityId);

    void upDateSecurityNameBySecurityId(UserSecurity userSecurity);

    void deleteUserSecurity(User_Security user_security);
}