$(document).ready(function()
{

	var tab = document.getElementById("tab").getElementsByTagName("li");
	var usermanager = document.getElementById("userManager");
	var rolemanager = document.getElementById("roleManager");
	var securitymanager = document.getElementById("securityManager");
	var manager = [ usermanager, rolemanager, securitymanager ];
	
	var th = document.getElementsByTagName("th");
	for (var i = 0; i < th.length; i++)
	{
		th[i].className = "text-center";
	}

	switch ($("#tag").val())
	{
	case "userManager":
		tab[0].className = "active";
		manager[0].style.display = "block";
		break;
	case "roleManager":
		tab[1].className = "active";
		manager[1].style.display = "block";
		break;
	case "securityManager":
		tab[2].className = "active";
		manager[2].style.display = "block";
		break;
	}

});