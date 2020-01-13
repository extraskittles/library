<%--
  Created by IntelliJ IDEA.
  User: extra
  Date: 2019/7/23
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link href="css/register.css" rel="stylesheet"/>
    <script src="js/jquery-1.3.2.min.js"></script>
    <script src="js/register.js"></script>--%>
</head>
<body>
<div>
<h3>注册账号</h3>
<form action="/register_success" method="post">
    <input type="text" name="userName" placeholder="请设置用户名"><span id="tips"></span><br>
    <input type="password" name="password" placeholder="请设置注册密码"><br>
    <input type="submit" value="注册">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/index.jsp">返回登录</a>
</form>
</div>
</body>
</html>
