$(document).ready(function ()
{
    $("#name").change(function ()
    {
        var name = $.trim($("#name").val());
        if (name != "")
        {
            $.ajax(
                {
                    url: "http://localhost:8080/Demo03/checkUserIsExist",
                    type: "POST",
                    data: "name=" + name,
                    success: function (result)
                    {
                        if (result == "Sorry,Already Exists")
                        {
                            $("#nameMessage").html("<span style='color:red'>" + result + "</span>");
                        } else
                        {
                            $("#nameMessage").html("<span style='color:green'>" + result + "</span>");
                        }
                    }
                });
        } else
        {
            $("#nameMessage").html("请输入您要注册的账号 ");
        }

    });

    $("#role").change(function ()
    {
        var role = $.trim($("#role").val());
        if (role != "")
        {
            $.ajax(
                {
                    url: "http://localhost:8080/Demo03/checkRoleIsExist",
                    type: "POST",
                    data: "role=" + role,
                    success: function (result)
                    {
                        if (result == "Sorry,Already Exists")
                        {
                            $("#roleMessage").html("<span style='color:red'>" + result + "</span>");
                        } else
                        {
                            $("#roleMessage").html("<span style='color:green'>" + result + "</span>");
                        }
                    }
                });
        }

    });

    $("#security").change(function ()
    {
        var security = $.trim($("#security").val());
        if (security != "")
        {
            $.ajax(
                {
                    url: "http://localhost:8080/Demo03/checkSecurityIsExist",
                    type: "POST",
                    data: "security=" + security,
                    success: function (result)
                    {
                        if (result == "Sorry,Already Exists")
                        {
                            $("#securityMessage").html("<span style='color:red'>" + result + "</span>");
                        } else
                        {
                            $("#securityMessage").html("<span style='color:green'>" + result + "</span>");
                        }
                    }
                });
        }

    });


});
