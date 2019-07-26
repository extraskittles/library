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
</head>
<body>
<h3>注册账号</h3>
<form action="/register_success" method="post">
    姓名：<input type="text" name="name"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="注册">&nbsp;<a href="/index.jsp">返回登录</a>
</form>
</body>
</html>
