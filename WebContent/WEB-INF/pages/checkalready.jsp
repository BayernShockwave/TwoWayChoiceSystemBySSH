<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>已选学生</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>第一已选</th>
				<th>第二已选</th>
				<th>第三已选</th>
				<th>第四已选</th>
				<th>第五已选</th>
				<th>第六已选</th>
				<th>第七已选</th>
				<th>第八已选</th>
				<th>第九已选</th>
				<th>第十已选</th>
			</tr>
		</thead>
		<tbody>
		    <tr>
				<td>${teabyid.twan1}</td>
				<td>${teachers.twan2}</td>
				<td>${teachers.twan3}</td>
				<td>${teabyid.twan4}</td>
				<td>${teabyid.twan5}</td>
				<td>${teabyid.twan6}</td>
				<td>${teabyid.twan7}</td>
				<td>${teabyid.twan8}</td>
				<td>${teabyid.twan9}</td>
				<td>${teabyid.twan10}</td>
			</tr>
		</tbody>
	</table>

</div>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"
	type="text/javascript" charset="utf-8"></script>

</body>
</html>