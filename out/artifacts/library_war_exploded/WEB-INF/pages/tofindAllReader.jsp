<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<table border="1px">
    <tr>
        <td>读者号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>地址</td>
        <td>手机号码</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${readers}" var="reader">
        <tr>
            <td>${reader.readerNum}</td>
            <td>${reader.readerName}</td>
            <td>${reader.sex}</td>
            <td>${reader.age}</td>
            <td>${reader.address}</td>
            <td>${reader.phoneNum}</td>
            <td><a href="/editReader?readerNum=${reader.readerNum}">编辑</a></td>
            <td><a href="/deleteReader?readerNum=${reader.readerNum}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
