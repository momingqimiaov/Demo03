$(document).ready(function()
{

	$("#name").blur(function()
	{
		var userName = $.trim($("#name").val());
		var userPassword = $.trim($("#password").val());
		if (userName != "" && userPassword != "")
		{
			$("#btnAddUser").removeAttr("disabled");
		} else
		{
			$("#btnAddUser").attr("disabled", true);
		}
	});
	$("#password").blur(function()
	{
		var userName = $.trim($("#name").val());
		var userPassword = $.trim($("#password").val());

		if (userName != "" && userPassword != "")
		{
			$("#btnAddUser").removeAttr("disabled");
		} else
		{
			$("#btnAddUser").attr("disabled", true);
		}
	});

	$("#role").blur(function()
	{
		var userName = $.trim($("#role").val());
		var userPassword = $.trim($("#roledescription").val());

		if (userName != "" && userPassword != "")
		{
			$("#btnAddRole").removeAttr("disabled");
		} else
		{
			$("#btnAddRole").attr("disabled", true);
		}
	});
	$("#roledescription").blur(function()
	{
		var userName = $.trim($("#role").val());
		var userPassword = $.trim($("#roledescription").val());

		if (userName != "" && userPassword != "")
		{
			$("#btnAddRole").removeAttr("disabled");
		} else
		{
			$("#btnAddRole").attr("disabled", true);
		}
	});

	$("#security").blur(function()
	{
		var userName = $.trim($("#security").val());
		var userPassword = $.trim($("#securitydescription").val());

		if (userName != "" && userPassword != "")
		{
			$("#btnAddSecurity").removeAttr("disabled");
		} else
		{
			$("#btnAddSecurity").attr("disabled", true);
		}
	});
	$("#securitydescription").blur(function()
	{
		var userName = $.trim($("#security").val());
		var userPassword = $.trim($("#securitydescription").val());

		if (userName != "" && userPassword != "")
		{
			$("#btnAddSecurity").removeAttr("disabled");
		} else
		{
			$("#btnAddSecurity").attr("disabled", true);
		}
	});
});
