<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书馆</title>
    <%--<script src="/js/jquery-1.3.2.min.js"></script>
    <script src="/js/editBook.js"></script>--%>
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
<br>
<table border="1px">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>书号</td>
        <td>价格</td>
        <td>借还</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
<%--    onclick="location.href='/register';" style="cursor: pointer"--%>
    <c:forEach items="${bookss}" var="book">
        <tr>
            <td>${book.bookName}</td>
            <td>${book.writer}</td>
            <td>${book.publish}</td>
            <td>${book.bookNum}</td>
            <td>${book.price}</td>
            <td><a href="/lendBook?bookName=${book.bookName}&status=${book.status}">${book.status}</a></td>
            <td ><a href="/editBook?bookName=${book.bookName}">编辑</a></td>
            <td><a href="/deleteBook?bookName=${book.bookName}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>