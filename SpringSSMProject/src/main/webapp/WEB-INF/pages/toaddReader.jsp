<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>图书馆</title>
</head>
<body>
<h2>图书管理系统</h2><a href=""></a>
<a href="/findAllBook">全部图书</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/findAllReader">全部读者</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/findAllLog">借还日志</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/tosetPassword">密码修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${userName},已登录&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/logout">退出</a><br>
<a href="/toaddBook">增加图书</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/toaddReader">增加读者</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<h4>读者姓名</h4><br>
<form action="/addReader" method="post">

    <input type="text" name="readerName" >
    <h4>读者号</h4>
    <input type="text" name="readerNum" >
    <h4>年龄</h4>
    <input type="text" name="age" >
    <h4>性别</h4>
    <input type="text" name="sex" >
    <h4>地址</h4>
    <input type="text" name="address" >
    <h4>手机号</h4>
    <input type="text" name="phoneNum" ><br>
    <input type="submit" value="提交">
</form>
</body>
</html>