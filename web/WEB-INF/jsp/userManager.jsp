<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<br/>
<br/>

<div class="container-fluid userManager" id="userManager" style="display: none;">
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-hover table-bordered  table-condensed">
                <thead>
                <tr>
                    <th>用户ID</th>
                    <th>用户姓名</th>
                    <th>用户密码</th>
                    <th>关于用户</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${userList}" var="user">
                <c:if test="${user.id%4==1}">
                <tr class="success">
                    </c:if>
                    <c:if test="${user.id%4==2}">
                <tr class="warning">
                    </c:if>
                    <c:if test="${user.id%4==3}">
                <tr class="info">
                    </c:if>
                    <c:if test="${user.id%4==0}">
                <tr class="active">
                    </c:if>
                    <td>${user.id }</td>
                    <td>${user.username }</td>
                    <td>${user.password }</td>
                    <td>${user.aboutuser}</td>
                    <td style="width: 250px;"><a href="${pageContext.request.contextPath}/deleteuser/${user.id}">
                        <button type="button" class="btn btn-danger btn-sm" style="width: 55px;">删除</button>
                    </a> <a href="${pageContext.request.contextPath}/updateuser/${user.id}">
                        <button type="button" class="btn btn-info btn-sm" style="width: 55px;">修改</button>
                    </a> <a href="${pageContext.request.contextPath}/assignrole/${user.id}">
                        <button type="button" class="btn btn-warning  btn-sm" style="width: 55px;">角色</button>
                    </a> <a href="${pageContext.request.contextPath}/assignsecurity/${user.id}">
                        <button type="button" class="btn btn-success  btn-sm" style="width: 55px;">权限</button>
                    </a></td>
                    </c:forEach>
                </tbody>
            </table>
            <button type="button" class="btn btn-success btn-sm" data-toggle="modal" data-target="#userModal" style="width: 80px;" onclick="">添加用户</button>
        </div>
    </div>
</div>


</body>
</html>