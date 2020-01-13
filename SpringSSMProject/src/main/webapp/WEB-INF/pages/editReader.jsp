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

<form action="/updateReader" method="post">
    <b>读者姓名</b> <input type="text" name="readerName" value="${reader.readerName}"><br>
    <b>读者号</b> <input type="text" name="readerNum" value="${reader.readerNum}" readonly="true"><br>
    <b>性别</b> <input type="text" name="sex" value="${reader.sex}"><br>
    <b>年龄</b> <input type="text" name="age" value="${reader.age}"><br>
    <b>地址</b> <input type="text" name="address" value="${reader.address}"><br>
    <b>手机号</b> <input type="text" name="phoneNum" value="${reader.phoneNum}"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
