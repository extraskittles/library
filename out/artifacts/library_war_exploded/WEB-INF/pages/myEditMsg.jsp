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

<h3>信息修改</h3>
<form action="/myHandleMsg" method="post" >

    <b>读者证号</b><input type="text" name="readerNum"  value="${readerNum}" readonly="true"><br>
    <b>姓名</b><input type="text"  name="readerName"  value="${reader.readerName}"><br>
    <b>性别</b><input type="text"  name="sex"  value="${reader.sex}"><br>
    <b>年龄</b><input type="text"  name="age"  value="${reader.age}"><br>
    <b>地址</b><input type="text"  name="address"  value="${reader.address}"><br>
    <b>电话</b><input type="text"  name="phoneNum"  value="${reader.phoneNum}"><br>
<input type="submit" value="确定">
</form>



</body>
</html>