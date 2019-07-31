<%--
  Created by IntelliJ IDEA.
  User: extra
  Date: 2019/7/20
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/index.css" rel="stylesheet"/>
    <script src="/js/jquery-1.3.2.min.js"></script>
    <script src="/js/index.js"></script>
</head>
<body>
<a href="/production">访客模式浏览商品</a><br>
<div>
        <form action="/production" method="post" onsubmit="return check();">
            <h3>用户名密码登录</h3>
            <input id="userName" type="text" name="name" placeholder="用户名"><br>
            <input id="password" type="password" name="password" placeholder="密码">
            <span id="tips"></span> <br>
            <input id="submit" type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/register">没有账号？</a>
        </form>
</div>
</body>
</html>
