<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="/findBook" method="post">
    <input type="text" name="bookName">
    <input type="submit" value="搜索"><br>
</form>

<table border="1px">
    <tr>
        <td>流水号</td>
        <td>图书名</td>
        <td>图书号</td>
        <td>读者证号</td>
        <td>借出日期</td>
        <td>归还日期</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${logs}" var="log">
        <tr>
            <td>${log.id}</td>
            <td>${log.bookName}</td>
            <td>${log.bookNum}</td>
            <td>${log.readerNum}</td>
            <td>${log.lendTime}</td>
            <td>${log.returnTime}</td>
            <td><a href="/deleteLog?id=${log.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
