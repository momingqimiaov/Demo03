<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</head>

<body style="background: url('${pageContext.request.contextPath}/img/bg.jpg');">
<div class="container" style="margin-top: 250px">
    <div class="middle center-block col-lg-offset-4">
        <form action="login" method="post">
            <div class="col-sm-offset-1">
                <span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<input type="text" name="name" id="name">
            </div>
            <br/>

            <div class="col-sm-offset-1">
                <span class="glyphicon glyphicon-lock"></span>&nbsp;&nbsp<input type="password" name="password">
            </div>
            <br/>

            <input class="submit" type="submit" value="登陆">
        </form>
    </div>
    <br/>

    <div class="copy-rights col-sm-offset-2">
        <a href="#">立即注册</a>| <a href="#">忘记密码？</a>| <a href="#">用户隐私</a>| <a href="#">用户协议</a>|
        <span style="color: #080808"><b>©2015 CHENSHANG . All rights reserved 京ICP备XXXXXX号 京公网安备1234567890</b></span>
    </div>
    <br/>
</div>
</body>
</html>
