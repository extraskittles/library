<%--
  Created by IntelliJ IDEA.
  User: extra
  Date: 2019/7/20
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/production" method="post">
    <h3>用户名密码登录</h3>
    姓名：<input type="text" name="name" value="${name}"><br>
    密码：<input type="password" name="password" value="${password}"><br>
    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/register">没有账号？</a>
</form>
</body>
</html>
