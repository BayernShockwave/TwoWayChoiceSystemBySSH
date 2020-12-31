<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学生界面</title>
<style type="text/css">
body {
background-color: #FFFFFF;font-family: "楷体";
}
a {
color: #000000;text-decoration: none;
}
a:hover {
color: #FF0000;
}
#container {
width: 100%;
margin: 0 auto;
text-align:center;
}
#logo {
width: 100%;height: 150px;
}
#title {
width: 100%;height: 50px;font-size: 50px;font-weight: bolder;text-align: center;background-color: #7FFFD4;
}
#content {
width: 100%;
}
#leftmenu {
float:left;width: 25%;height: 500px;font-size: 25px;font-weight: bolder;background-color: #00FFFF;border:1px solid #000000;
}
#leftmenu ul {
list-style-type: none;margin:0px;padding:0px;
}
#leftmenu li {
border-bottom:0px solid #000000;padding:0px;width: 100%;height: 72px;line-height: 70px;
}
#mainmenu {
float:left;width:1123px;height: 500px;font-size: 25px;font-weight: bolder;text-align: center;background-color: #00FFFF;
border-right:1px solid #000000;border-top:1px solid #000000;border-bottom:1px solid #000000;
}
#foot {
clear: both;width: 100%;height: 20px;background-color: #7FFFD4;text-align: center;color: #FFFFFF;
}
</style>
</head>
<body>
<div id="container">
<div id="logo">
<img src="img/logo.JPG" />
</div>
<div id="title">研究生导师双向选择系统</div>
<div id="content">
<div id="leftmenu">
<ul>
<a href="student/checkinfo?stuid=${stuid}">查看个人信息</a><br/>
<br/>
<a href="student/changepwd?stuid=${stuid}">修改个人密码</a><br/>
<br/>
<a href="student/checktea?stuid=${stuid}">查看选择导师</a><br/>
<br/>
<a href="student/smartmatch?stuid=${stuid}">开启智能匹配</a><br/>
<br/>
<a href="student/checkwish?stuid=${stuid}">查看修改志愿</a><br/>
<br/>
<a href="student/checkinfo?stuid=${stuid}">查看最终结果</a><br/>
<br/>
<a href="http://localhost:8080/TWCS/login.jsp">退出双选系统</a><br/>
<br/>
</ul>
</div>
<div id="mainmenu">
<br>
欢迎!!!${stuid}!!!<br>
请选择您的操作!!!<br>
<br>
具体操作如下:<br>
您可以在此查看个人的全部信息<br>
您可以在此修改您的个人密码<br>
您可以在此查看您所在学院全部导师的信息<br>
您可以在此选择您心仪的导师<br>
您可以在此开启智能匹配选择<br>
您可以在此查看或修改您的志愿<br>
您可以在此查看最终志愿结果<br>
<br>
注意事项如下:<br>
您必须选且选满三个志愿!!!
</div>
</div>
<div id="foot">网站版权声明:@20171403陈靖秋</div>
</div>
</body>
</html>