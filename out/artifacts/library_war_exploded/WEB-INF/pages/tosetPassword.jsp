<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>图书馆</title>
</head>
<body>
<h2>图书管理系统</h2>
<a href="/findAllBook">全部图书</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/findAllReader">全部读者</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/findAllLog">借还日志</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/tosetPassword">密码修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${userName},已登录&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/logout">退出</a><br>
<a href="/toaddBook">增加图书</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/toaddReader">增加读者</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<h3>密码修改</h3>
<form action="/setPassword" method="post">
    <input type="text" name="oldPassword" placeholder="输入就密码"><br>
    <input type="text" name="newPassword" placeholder="输入新密码"><br>
    <input type="text" name="confirmPassword" placeholder="再次输入新密码"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>