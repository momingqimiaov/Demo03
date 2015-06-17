package model;

public class User_Role {
    private Integer id;

    private Integer userid;

    private String userrloe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserrloe() {
        return userrloe;
    }

    public void setUserrloe(String userrloe) {
        this.userrloe = userrloe == null ? null : userrloe.trim();
    }

    @Override
    public String toString()
    {
        return "User_Role{" +
                "id=" + id +
                ", userid=" + userid +
                ", userrloe='" + userrloe + '\'' +
                '}';
    }
}