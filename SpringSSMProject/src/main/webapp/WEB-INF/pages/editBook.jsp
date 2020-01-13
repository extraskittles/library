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

<form action="/updateBook" method="post">
    <b>书名</b> <input type="text" name="bookName" value="${book.bookName}"><br>
    <b>作者</b> <input type="text" name="writer" value="${book.writer}"><br>
    <b>出版社</b> <input type="text" name="publish" value="${book.publish}"><br>
    <b>图书号</b> <input type="text" name="bookNum" value="${book.bookNum}" readonly="true"><br>
    <b>价格</b> <input type="text" name="price" value="${book.price}"><br>
    <b>状态</b> <input type="text" name="status" value="${book.status}" readonly="true"><br>
    <input type="submit" value="确定"><br>
</form>
</body>
</html>
