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

<h3>我的信息</h3>
<table>
    <tr>
        <td><b>读者证号</b></td>
        <td>${readerNum}</td>
    </tr>
    <tr>
        <td><b>姓名</b></td>
        <td>${reader.readerName}</td>
    </tr>
    <tr>
        <td><b>性别</b></td>
        <td>${reader.sex}</td>
    </tr>
    <tr>
        <td><b>年龄</b></td>
        <td>${reader.age}</td>
    </tr>
    <tr>
        <td><b>地址</b></td>
        <td>${reader.address}</td>
    </tr>
    <tr>
        <td><b>电话</b></td>
        <td>${reader.phoneNum}</td>
    </tr>
</table>

<a href="/myEditMsg" >修改</a>

</body>
</html>
