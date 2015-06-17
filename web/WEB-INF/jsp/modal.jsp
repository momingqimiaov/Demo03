<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/modal.js"></script>
    <title>Insert title here</title>
</head>
<body>
<div class="modal fade bs-example-modal-sm" id="userModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title text-left" id="userModalLabel">添加用户</h4>
            </div>
            <div class="modal-body " style="background-color: gray;">
                <form id="userForm" action="${pageContext.request.contextPath}/addUser" method="post">
                    <div>
                        <span class="glyphicon glyphicon-user"></span><input type="text" name="name" id="name"> <br/> <span id="nameMessage"></span>
                    </div>
                    <br/>

                    <div>
                        <span class="glyphicon glyphicon-lock"></span><input type="password" name="password" id="password">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm " id="btnAddUser" disabled="disabled" onclick="document.getElementById('userForm').submit()">添加</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade bs-example-modal-sm" id="roleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title text-left" id="roleModalLabel">添加角色</h4>
            </div>
            <div class="modal-body " style="background-color: gray;">
                <form id="roleForm" action="${pageContext.request.contextPath}/addRole" method="post">
                    <div>
                        角色名称：<input type="text" name="role" id="role"> <br/> <span id="roleMessage"></span>
                    </div>
                    <br/>

                    <div>
                        角色描述：<input type="text" name="roledescription" id="roledescription">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm" id="btnAddRole" disabled="disabled" onclick="document.getElementById('roleForm').submit()">添加</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade bs-example-modal-sm" id="securityModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title text-left" id="securityModalLabel">添加权限</h4>
            </div>
            <div class="modal-body " style="background-color: gray;">
                <form id="securityForm" action="${pageContext.request.contextPath}/addSecurity" method="post">
                    <div>
                        权限名称：<input type="text" name="security" id="security"><br/> <span id="securityMessage"></span>
                    </div>
                    <br/>

                    <div>
                        权限描述：<input type="text" name="securitydescription" id="securitydescription">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm" id="btnAddSecurity" disabled="disabled" onclick="document.getElementById('securityForm').submit()">添加</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>