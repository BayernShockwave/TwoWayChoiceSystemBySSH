<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>备选学生</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</body>
<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>No.1</th>
				<th>操作</th>
				<th>No.2</th>
				<th>操作</th>
				<th>No.3</th>
				<th>操作</th>
				<th>No.4</th>
				<th>操作</th>
				<th>No.5</th>
				<th>操作</th>
				<th>No.6</th>
				<th>操作</th>
				<th>No.7</th>
				<th>操作</th>
				<th>No.8</th>
				<th>操作</th>
				<th>No.9</th>
				<th>操作</th>
				<th>No.10</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		    <tr>
				<td>${teabyid.tcho1}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho1}&teaid=${teaid}">确认</a>
				</td>
				<td>${teachers.tcho2}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho2}&teaid=${teaid}">确认</a>
				</td>
				<td>${teachers.tcho3}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho3}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho4}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho4}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho5}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho5}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho6}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho6}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho7}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho7}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho8}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho8}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho9}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho9}&teaid=${teaid}">确认</a>
				</td>
				<td>${teabyid.tcho10}</td>
				<td>
					<a class="btn btn-primary" href="choose?stuid=${teabyid.tcho10}&teaid=${teaid}">确认</a>
				</td>
			</tr>
		</tbody>
	</table>

</div>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"
	type="text/javascript" charset="utf-8"></script>

</body>
</html>