package model;

public class User_Security {
    private Integer id;

    private Integer userid;

    private String usersecurity;

    private Integer securityid;

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

    public String getUsersecurity() {
        return usersecurity;
    }

    public void setUsersecurity(String usersecurity) {
        this.usersecurity = usersecurity == null ? null : usersecurity.trim();
    }

    public Integer getSecurityid() {
        return securityid;
    }

    public void setSecurityid(Integer securityid) {
        this.securityid = securityid;
    }
}