<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpdateUser</title>
<link rel="stylesheet" style="text/css" href="../css/bootstrap.min.css">
<script type="text/javascript" src="../js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/ajax.js"></script>
<script type="text/javascript" src="../js/modal.js"></script>
</head>
<body>
	<br />
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">
				<span class="label label-warning">修改${ security.security}的信息</span>
			</h3>
		</div>

		<div class="panel-body">
			<form id="securityMessageFrom" action="${pageContext.request.contextPath}/updateSecurityMessage/${security.id}" method="post">
				<div class="input-group">
					<span class=" glyphicon glyphicon-user"></span> <input type="text" class="form-control" name="security" id="security" value="${ security.security}"> <span id="roleMessage"></span>
				</div>
				<div class="input-group">
					<span class=" glyphicon glyphicon-lock"></span> <input type="text" class="form-control" name="securitydescription" id="securitydescription" value="${ security.securitydescription}">
				</div>
				<br />
			</form>
			<div class="btn-group" role="group">
				<button type="button" class="btn btn-default" onclick="history.back()">取消</button>
				<button type="button" class="btn btn-default " id="btnAddSecurity" disabled="disabled" onclick="document.getElementById('securityMessageFrom').submit()">修改</button>
			</div>

		</div>
	</div>
</body>
</html>