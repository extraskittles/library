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

<form action="/myFindBook" method="post">
    <input type="text" name="bookName">
    <input type="submit" value="搜索"><br>
</form>
<b>查询结果:</b>
<table border="1px">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>书号</td>
        <td>价格</td>
        <td>状态</td>

    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookName}</td>
            <td>${book.writer}</td>
            <td>${book.publish}</td>
            <td>${book.bookNum}</td>
            <td>${book.price}</td>
            <td>${book.status}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
