package dao;


import model.User_Security;

public interface User_SecurityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_Security record);

    int insertSelective(User_Security record);

    User_Security selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Security record);

    int updateByPrimaryKey(User_Security record);
}