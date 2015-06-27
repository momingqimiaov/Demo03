$(document).ready(function()
{

	$("#name").focus(function()
	{
		$("#nameMessage").css(
		{
			"color" : "red"
		});
	});

	$("#name").blur(function()
	{
		var p1 = $.trim($("#p1").val());
		var p2 = $.trim($("#p2").val());
		$("#nameMessage").css(
		{
			"color" : "#84548d"
		});
		if (p2 != "" && p1 != "")
		{
			judge();
		}

	});

	$("#p1").focus(function()
	{
		$("#p1Message").css(
		{
			"color" : "red"
		});
	});

	$("#p1").blur(function()
	{
		$("#p1Message").css(
		{
			"color" : "#84548d"
		});
		var p1 = $.trim($("#p1").val());
		if (p1 != "")
		{
			judge();
			$("#p1Message").html("(:");
		} else
		{
			$("#p1Message").html("请输入您的密码");
		}

	});

	$("#p2").focus(function()
	{
		$("#p2Message").css(
		{
			"color" : "red"
		});
	});

	$("#p2").blur(function()
	{
		$("#p2Message").css(
		{
			"color" : "#84548d"
		});
		var p2 = $.trim($("#p2").val());
		if (p2 != "")
		{
			judge();
		}
	});

	function judge()
	{
		var p1 = $.trim($("#p1").val());
		var p2 = $.trim($("#p2").val());
		var name = $.trim($("#name").val());

		if (p1 != p2)
		{
			$("#p2Message").html("两次密码不一致");
			$(".submit").attr("disabled", true);
		} else
		{
			if (name != "")
			{
				$(".submit").removeAttr("disabled");
			} else
			{
				$(".submit").attr("disabled", true);
			}
			$("#p2Message").html("(:");
		}

	}

});