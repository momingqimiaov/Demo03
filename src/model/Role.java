package model;

public class Role {
    private Integer id;

    private String rolename;

    private String aboutrole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getAboutrole() {
        return aboutrole;
    }

    public void setAboutrole(String aboutrole) {
        this.aboutrole = aboutrole == null ? null : aboutrole.trim();
    }

    @Override
    public String toString()
    {
        return "Role{" +
                "aboutrole='" + aboutrole + '\'' +
                ", id=" + id +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}