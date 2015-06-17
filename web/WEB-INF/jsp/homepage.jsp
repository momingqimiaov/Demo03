<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/homepage.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/modal.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/modal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/homepage.js"></script>
    <title>HomePage</title>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/img/bg1.jpg');">

<div class="container">
    <div class="header">
        <img class="img-circle" src="${pageContext.request.contextPath}/img/t.jpg">

        <form class="navbar-form navbar-right" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default btn-sm">查找</button>
        </form>
        <a href="${pageContext.request.contextPath}/index">
            <button type="button" class="btn btn-warning btn-sm">♥退出登陆♥</button>
        </a>
    </div>
    <div class="context">
        <div class="context-lef" id="tab">
            <h4 style="color: purple;">菜单</h4>
            <ul class="nav nav-pills nav-stacked">
                <li><a href="${pageContext.request.contextPath}/homepage/userManager">用户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/homepage/roleManager">角色管理</a></li>
                <li><a href="${pageContext.request.contextPath}/homepage/securityManager">权限管理</a></li>
            </ul>
        </div>
        <div class="context-rig">
            <jsp:include page="userManager.jsp"/>
            <jsp:include page="roleManager.jsp"/>
            <jsp:include page="securityManager.jsp"/>
            <jsp:include page="modal.jsp"/>

        </div>
    </div>
</div>
<div class="hidden">
    <input id="tag" type="hidden" value="${tag }"/> <input id="userList" type="hidden" value="${userList }"/>
</div>

</body>
</html>