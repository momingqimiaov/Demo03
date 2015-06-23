package model;

public class User_Role
{
    private Integer id;

    private Integer userid;

    private String userrloe;

    private Integer roleid;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getUserid()
    {
        return userid;
    }

    public void setUserid(Integer userid)
    {
        this.userid = userid;
    }

    public String getUserrloe()
    {
        return userrloe;
    }

    public void setUserrloe(String userrloe)
    {
        this.userrloe = userrloe == null ? null : userrloe.trim();
    }

    public Integer getRoleid()
    {
        return roleid;
    }

    public void setRoleid(Integer roleid)
    {
        this.roleid = roleid;
    }

    @Override
    public String toString()
    {
        return "User_Role{" +
                "id=" + id +
                ", userid=" + userid +
                ", userrloe='" + userrloe + '\'' +
                ", roleid=" + roleid +
                '}';
    }

    public User_Role()
    {
    }

    public User_Role(Integer id, Integer userid, String userrloe)
    {
        this.id = id;
        this.userid = userid;
        this.userrloe = userrloe;
    }

    public User_Role(Integer userid, String userrloe)
    {
        this.userid = userid;
        this.userrloe = userrloe;
    }
}