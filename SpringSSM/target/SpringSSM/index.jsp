<%--
  Created by IntelliJ IDEA.
  User: extra
  Date: 2019/7/20
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="/findAll">查询所有账户</a>
        <br>
        <br>
        <form action="/save" method="post">
            姓名：<input type="text" name="name"><br>
            金额：<input type="text" name="password"><br>
            <input type="submit" value="保存">
        </form>
</body>
</html>
