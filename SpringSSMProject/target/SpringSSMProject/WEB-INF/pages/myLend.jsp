<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>我的图书馆</title>
</head>
<body>
<h2>我的图书馆</h2>
<a href="/mySearch">图书查询</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/myMsg">个人信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/myLend">我的借还</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/myPassword">密码修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${userName},已登录&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/logout">退出</a><br>

<table border="1px">
    <tr>
        <td>图书号</td>
        <td>图书名</td>
        <td>借出日期</td>
        <td>归还日期</td>

    </tr>
    <c:forEach items="${logs}" var="log">
        <tr>
            <td>${log.readerNum}</td>
            <td>${log.bookName}</td>
            <td>${log.lendTime}</td>
            <td>${log.returnTime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
