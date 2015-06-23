package model;

/**
 * Created by ChenShang on 2015/6/23 0023.
 */
public class UserRoleRole
{
    public String role;
    public int roleId;

    public UserRoleRole(String role, int roleId)
    {
        super();
        this.role = role;
        this.roleId = roleId;
    }

    public UserRoleRole()
    {
        super();
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public int getRoleId()
    {
        return roleId;
    }

    public void setRoleId(int roleId)
    {
        this.roleId = roleId;
    }

    @Override
    public String toString()
    {
        return "UserRoleRole [role=" + role + ", roleId=" + roleId + "]";
    }
}
