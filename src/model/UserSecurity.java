package model;

public class UserSecurity
{

	public String usersecurity;
	public int securityid;

	public UserSecurity(String usersecurity, int securityid)
	{
		super();
		this.usersecurity = usersecurity;
		this.securityid = securityid;
	}

	public UserSecurity()
	{
		super();
	}

	public String getUsersecurity()
	{
		return usersecurity;
	}

	public void setUsersecurity(String usersecurity)
	{
		this.usersecurity = usersecurity;
	}

	public int getSecurityid()
	{
		return securityid;
	}

	public void setSecurityid(int securityid)
	{
		this.securityid = securityid;
	}

	@Override
	public String toString()
	{
		return "UserSecurity [usersecurity=" + usersecurity + ", securityid=" + securityid + "]";
	}

}
