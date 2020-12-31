<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>修改个人密码</title>
</head>
<body>
<form action="changepwd_rs" method = "post">
    <input type="text" style="display:none"  id="teaid" name="teaid" value="${teabyid.tno}">
	原密码：<input type="password" id="oldpassword" name="oldpassword" placeholder="请输入原密码"><br/>
	新密码：<input type="password" id="newpassword" name="newpassword" placeholder="请输入新密码"><br/>
	确认新密码：<input type="password" id="check_newpassword" name="check_newpassword" placeholder="请再次输入新密码"><br/>
	<input type="submit" id="confirm" name="confirm" value="确认">
</form>
</body>
</html>