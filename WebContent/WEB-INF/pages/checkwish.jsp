<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看志愿</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>第一志愿</th>
				<th>操作</th>
				<th>第二志愿</th>
				<th>操作</th>
				<th>第三志愿</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		    <td>${stu.sno}</td>
			<td>${stu.sname}</td>
			<td>${stu.scho1}</td>
			<td>
			    <a class="btn btn-primary" href="editwish1?teaid=${stu.scho1}&stuid=${stu.sno}">确认修改</a>
			</td>
			<td>${stu.scho2}</td>
			<td>
			    <a class="btn btn-primary" href="editwish2?teaid=${stu.scho2}&stuid=${stu.sno}">确认修改</a>
			</td>
			<td>${stu.scho3}</td>
			<td>
			    <a class="btn btn-primary" href="editwish3?teaid=${stu.scho3}&stuid=${stu.sno}">确认修改</a>
			</td>
		</tbody>
	</table>

</div>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"
	type="text/javascript" charset="utf-8"></script>

</body>
</html>