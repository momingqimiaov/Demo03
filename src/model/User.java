package model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String aboutuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAboutuser() {
        return aboutuser;
    }

    public void setAboutuser(String aboutuser) {
        this.aboutuser = aboutuser == null ? null : aboutuser.trim();
    }

    @Override
    public String toString()
    {
        return "User{" +
                "aboutuser='" + aboutuser + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}