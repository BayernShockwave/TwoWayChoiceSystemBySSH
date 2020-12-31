<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统开放时间</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>开放时间</th>
				<th>截止时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		  
			<c:forEach var="sysOpens" items="${list}" varStatus="status">
				<tr>
					<td>${sysOpens.sysbegin}</td>
					<td>${sysOpens.sysend}</td>
					<td>
						<a class="btn btn-primary" href="edittime?tid=${sysOpens.tid}">修改</a>
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