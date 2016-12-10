<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/4
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>edit page</title>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="${ctx}/index.jsp"/>
</c:if>
<h1>edit page</h1>
${sessionScope.user.username}
<hr>
<a href="${ctx}/user/logout">LOGOUT</a>
<hr>
<form action="${ctx}/book/update" method="post">
    <input type="hidden" name="id" value="${sessionScope.book.id}">
    <input type="text" name="title" value="${sessionScope.book.title}"><br>
    <input type="submit" value="SAVE">
</form>
</body>
</html>