package service;

import dao.User_SecurityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ChenShang on 2015/6/20 0020.
 */
@Service
public class User_SecurityService
{
    @Autowired
    User_SecurityMapper user_securityMapper;

    public void deletUserSecurityByUserId(Integer userId)
    {
        user_securityMapper.deletUserSecurityByUserId(userId);
    }

    public List<String> getSecurityNameByUserId(Integer userId)
    {
        return user_securityMapper.getSecurityNameByUserId(userId);
    }

    public List<String> getUserSecurityBySecurityID(Integer id)
    {
        return user_securityMapper.getUserSecurityBySecurityID(id);
    }

    public void deleteUserBySecurityID(Integer id)
    {
        user_securityMapper.deletUserSecurityBySecurityID(id);
    }
}
