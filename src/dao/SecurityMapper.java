package dao;


import model.Security;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SecurityMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(Security record);

    int insertSelective(Security record);

    Security selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Security record);

    int updateByPrimaryKey(Security record);

    List<Security> getAllSecurityList();

    List<String> getAllSecurityNameList();

}