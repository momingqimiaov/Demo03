<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript" src="../js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<div class="container">
    <br/>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">已分配的权限</h3>
        </div>
        <div class="panel-body">
            <div class="container-fluid ">
                <div class="row-fluid">
                    <div class="span12">
                        <form id="F1" action="${pageContext.request.contextPath}/removeSecurity/${id}">
                            <table class="table table-hover table-bordered  table-condensed">
                                <thead>
                                <tr>
                                    <th>权限ID</th>
                                    <th>权限名称</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${assignedSecurityList}" var="assignedSecurityList">
                                    <tr class="active">
                                        <td><input type="checkbox" id="1" name="checkbox" value="${assignedSecurityList}"/> ${assignedSecurityList}</td>
                                        <td>${assignedSecurityList}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm " onclick="document.getElementById('F1').submit()">批量移除</button>
            </div>
        </div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">未分配的权限</h3>
        </div>
        <div class="panel-body">
            <div class="container-fluid ">
                <div class="row-fluid">
                    <div class="span12">
                        <form id="F2" action="${pageContext.request.contextPath}/SecurityAssigned/${id}" method="post">
                            <table class="table table-hover table-bordered  table-condensed">
                                <thead>
                                <tr>
                                    <th>权限ID</th>
                                    <th>权限名称</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${unassignedSecurityList}" var="unassignedSecurityList">
                                    <tr class="warning">
                                        <td><input type="checkbox" id="1" name="checkbox" value="${unassignedSecurityList}"/> ${unassignedSecurityList}</td>
                                        <td>${unassignedSecurityList}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm " onclick="history.back()">返回</button>
                <button type="button" class="btn btn-primary btn-sm " onclick="document.getElementById('F2').submit()">批量分配</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>