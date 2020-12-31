<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学院级管理员</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<a href="add">添加学院级管理员</a>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>工号</th>
				<th>姓名</th>
				<th>所属学院</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		  
			<c:forEach var="colAdmins" items="${list}" varStatus="status">
				<tr>
					<td>${colAdmins.cno}</td>
					<td>${colAdmins.cname}</td>
					<td>${colAdmins.ccol}</td>
					<td>
						<a class="btn btn-primary" href="edit?id=${colAdmins.cno}">修改</a>
					    <a class="btn btn-warning" href="delete?id=${colAdmins.cno}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"
	type="text/javascript" charset="utf-8"></script>

</body>
</html>