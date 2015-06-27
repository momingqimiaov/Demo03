<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/signup.css">
    <script type="text/javascript" src="./js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="./js/ajax.js"></script>
    <script type="text/javascript" src="./js/modal.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-5 col-sm-offset-4 well well-sm ">
            <button type="button" class="close" onclick="history.back()">&times;</button>
            <form action="submit" method="post">
                <div>
                    <img class="img-circle img-thumbnail img1"> <input id="name" type="text" name="name" > <span id="nameMessage">请输入您要注册的账号</span>
                </div>
                <hr>
                <div>
                    <img class="img-circle img2"> <input id="p1" type="password" name="password1"> <span id="p1Message">请输入您的密码</span>
                </div>
                <hr>
                <div>
                    <img class="img-circle img2"> <input id="p2" type="password" name="password2"> <span id="p2Message">请再次输入您的密码</span>
                </div>
                <hr>
                <input class="btn btn-warning btn-sm submit " type="submit" value="立即注册" disabled="disabled">
            </form>
        </div>
    </div>
</div>
</body>
</html>