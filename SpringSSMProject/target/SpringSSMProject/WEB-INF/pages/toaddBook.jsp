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

<form action="/addBook" method="post">
    <h4>图书名</h4><br>
    <input type="text" name="bookName">
    <h4>作者</h4><br>
    <input type="text" name="writer">
    <h4>出版社</h4><br>
    <input type="text" name="publish">
    <h4>价格</h4><br>
    <input type="text" name="price"><br>
    <h4>图书号码</h4><br>
    <input type="text" name="bookNum"><br>

    <input type="submit" value="提交">
</form>

</body>
</html>
