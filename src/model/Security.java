package model;

public class Security
{
    private Integer id;

    private String securityname;

    private String aboutsecurity;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getSecurityname()
    {
        return securityname;
    }

    public void setSecurityname(String securityname)
    {
        this.securityname = securityname == null ? null : securityname.trim();
    }

    public String getAboutsecurity()
    {
        return aboutsecurity;
    }

    public void setAboutsecurity(String aboutsecurity)
    {
        this.aboutsecurity = aboutsecurity == null ? null : aboutsecurity.trim();
    }

    @Override
    public String toString()
    {
        return "Security{" +
                "aboutsecurity='" + aboutsecurity + '\'' +
                ", id=" + id +
                ", securityname='" + securityname + '\'' +
                '}';
    }


    public Security()
    {
    }

    public Security(Integer id, String securityname, String aboutsecurity)
    {
        this.id = id;
        this.securityname = securityname;
        this.aboutsecurity = aboutsecurity;
    }

    public Security(String securityname, String aboutsecurity)
    {
        this.securityname = securityname;
        this.aboutsecurity = aboutsecurity;
    }
}