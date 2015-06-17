<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div class="container-fluid role-manager" style="display: none;" id="roleManager">
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-hover table-bordered  table-condensed">
                <thead>
                <tr>
                    <th>角色ID</th>
                    <th>角色名</th>
                    <th>角色描述</th>
                    <th style="width: 120px;">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${roleList}" var="role">
                <c:if test="${role.id%4==1}">
                <tr class="success">
                    </c:if>
                    <c:if test="${role.id%4==2}">
                <tr class="warning">
                    </c:if>
                    <c:if test="${role.id%4==3}">
                <tr class="info">
                    </c:if>
                    <c:if test="${role.id%4==0}">
                <tr class="active">
                    </c:if>
                    <td>${role.id }</td>
                    <td>${role.rolename }</td>
                    <td>${role.aboutrole}</td>
                    <td><a href="${pageContext.request.contextPath}/deleterole/${role.id}">
                        <button type="button" class="btn btn-danger btn-sm" style="width: 50px;">删除</button>
                    </a> <a href="${pageContext.request.contextPath}/updaterole/${role.id}">
                        <button type="button" class="btn btn-warning btn-sm" style="width: 50px;">修改</button>
                    </a></td>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <button type="button" class="btn btn-success btn-sm" data-toggle="modal" data-target="#roleModal" style="width: 80px;">添加角色</button>
</div>
</body>
</html>