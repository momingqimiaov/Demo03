package model;

public class User
{
    private Integer id;

    private String username;

    private String password;

    private String role;

    private String security;

    private String aboutuser;

    public User()
    {
    }

    public User(Integer id, String username, String password, String role, String security, String aboutuser)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.security = security;
        this.aboutuser = aboutuser;
    }

    public User(String userName, String password)
    {
        this.username = userName;
        this.password = password;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username == null ? null : username.trim();
    }

    public String getAboutuser()
    {
        return aboutuser;
    }

    public void setAboutuser(String aboutuser)
    {
        this.aboutuser = aboutuser == null ? null : aboutuser.trim();
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password == null ? null : password.trim();
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role == null ? null : role.trim();
    }

    public String getSecurity()
    {
        return security;
    }

    public void setSecurity(String security)
    {
        this.security = security == null ? null : security.trim();
    }

    @Override
    public String toString()
    {
        return "User{" +
                "aboutuser='" + aboutuser + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", security='" + security + '\'' +
                '}';
    }


}