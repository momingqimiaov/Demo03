package model;

public class User_Security {
    private Integer id;

    private Integer userid;

    private String usersecurity;

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

    @Override
    public String toString()
    {
        return "User_Security{" +
                "id=" + id +
                ", userid=" + userid +
                ", usersecurity='" + usersecurity + '\'' +
                '}';
    }
}