package service;

import dao.SecurityMapper;
import model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService
{
    @Autowired
    SecurityMapper securityMapper;

    public Security getSecurityById(Integer id)
    {
        return securityMapper.selectByPrimaryKey(id);
    }

    public List<Security> getAllSecurityList()
    {
        return securityMapper.getAllSecurityList();
    }


    public List<String> getAllSecurityNameList()
    {
        return securityMapper.getAllSecurityNameList();
    }

    public void addSecurity(Security security)
    {
        securityMapper.insertSelective(security);
    }

    public void deleteSecurityById(Integer id)
    {
        securityMapper.deleteByPrimaryKey(id);
    }

}
