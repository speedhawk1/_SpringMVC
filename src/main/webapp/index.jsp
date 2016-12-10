<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/4
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>index page</title>
    <link rel="stylesheet" href="${ctx}/static/css/style.css">
</head>
<body>
<h1>index page</h1>
<form action="${ctx}/user/login" method="post">
    <input type="text" name="username" placeholder="USERNAME" value="tester"><br>
    <input type="password" name="password" placeholder="PASSWORD" value="123"><br>
    <input type="submit" value="LOGIN">
</form>
${requestScope.message}
<hr>
<a href="${ctx}/signup.jsp">SIGN UP</a>
</body>
</html>
