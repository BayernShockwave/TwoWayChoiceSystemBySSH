<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>导师</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<a href="add_ca?col=${col}">添加导师</a>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>工号</th>
				<th>姓名</th>
				<th>所属学院</th>
				<th>所属专业</th>
				<th>可选上限</th>
				<th>专业方向</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		  
			<c:forEach var="teachers" items="${list}" varStatus="status">
				<tr>
					<td>${teachers.tno}</td>
					<td>${teachers.tname}</td>
					<td>${teachers.tcol}</td>
					<td>${teachers.tdis}</td>
					<td>${teachers.tmax}</td>
					<td>${teachers.thob}</td>
					<td>
						<a class="btn btn-primary" href="edit_ca?id=${teachers.tno}">修改</a>
					    <a class="btn btn-warning" href="delete_ca?id=${teachers.tno}">删除</a>
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